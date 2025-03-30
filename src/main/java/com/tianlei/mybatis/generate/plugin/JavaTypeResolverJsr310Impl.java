//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tianlei.mybatis.generate.plugin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

public class JavaTypeResolverJsr310Impl extends JavaTypeResolverDefaultImpl {
    public JavaTypeResolverJsr310Impl() {
    }

    protected FullyQualifiedJavaType overrideDefaultType(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
        FullyQualifiedJavaType answer = defaultType;
        switch (column.getJdbcType()) {
            case -7:
                answer = this.calculateBitReplacement(column, defaultType);
                break;
            case 2:
            case 3:
                answer = this.calculateBigDecimalReplacement(column, defaultType);
                break;
            case 91:
                answer = new FullyQualifiedJavaType(LocalDate.class.getName());
                break;
            case 92:
                answer = new FullyQualifiedJavaType(LocalTime.class.getName());
                break;
            case 93:
                answer = new FullyQualifiedJavaType(LocalDateTime.class.getName());
        }

        return answer;
    }
}
