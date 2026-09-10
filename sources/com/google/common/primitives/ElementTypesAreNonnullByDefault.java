package com.google.common.primitives;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network/classes2.dex
  classes4.dex
 */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@TypeQualifierDefault
@Nonnull
@Retention(RetentionPolicy.RUNTIME)
public @interface ElementTypesAreNonnullByDefault {
}
