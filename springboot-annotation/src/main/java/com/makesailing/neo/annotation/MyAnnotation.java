package com.makesailing.neo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * #
 *
 * @author <a href="mailto:jamie.li@wolaidai.com">jamie.li</a>
 * @date 2018/7/16 17:25
 */

// Target 注解决定MyAnnotation 可以作用在哪些成分上 eg : 类 、属性 、方法
@Target({ElementType.METHOD, ElementType.TYPE})
// Retention 决定注解MyAnnotataion的生命周期
/**
 * 有三种类型 :
 * 1. RetentionPolicy.SOURCE : 指让MyAnnotation 只在Java源文件(.java)中存在,编译成 .class注解就不存在了 eg : @Override
 * 2. RetentionPolicy.CLASS : 指让MyAnnotation 在Java源文件(.java) 中存在,编译成 .class 也存在,被MyAnnotetion标识的类
 *    被类加载器加载到内存中后MyAnnotation就不存在了
 * 3. RetentionPolicy.RUNTIME : 指让MyAnnotatin 这个生命周期都一直存在
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	/**
	 * 定义基础属性
	 */
	String color() default "green";

	/**
	 * 如果一个注解中有一名称为 value 的属性,且你只想设置value属性(即其他属性为默认值或者只有一个value属性),那么可以省略 "value="部分
	 */
	String value();
}
