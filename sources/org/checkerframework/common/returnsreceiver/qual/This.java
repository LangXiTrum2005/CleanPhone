package org.checkerframework.common.returnsreceiver.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PolymorphicQualifier;
import org.checkerframework.framework.qual.TargetLocations;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations
@Retention(RetentionPolicy.RUNTIME)
@PolymorphicQualifier
public @interface This {
}
