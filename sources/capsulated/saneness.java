package capsulated;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/* JADX INFO: compiled from: Blocking.java */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Qualifier
public @interface saneness {
}
