package com.makesailing.neo.use;

import com.makesailing.neo.annotation.MyAnnotation;

/**
 * #
 *
 * @author <a href="mailto:jamie.li@wolaidai.com">jamie.li</a>
 * @date 2018/7/16 17:43
 */
@MyAnnotation("makesailing")
public class AnnotationUse {

	public static void main(String[] args) {
		// 这里是检查Annotation类是否有注解，这里需要使用反射才能完成对Annotation类的检查
		if (AnnotationUse.class.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = AnnotationUse.class.getAnnotation(MyAnnotation.class);
			System.out.println("============>  " + annotation.value());
		}
	}
}


