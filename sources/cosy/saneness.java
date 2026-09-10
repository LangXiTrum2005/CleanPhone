package cosy;

import androidx.compose.runtime.stratoscope;
import androidx.compose.runtime.unconsolidated;
import androidx.p001lifecycle.arytenoidectomy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.wireman;

/* JADX INFO: compiled from: LocalLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/unconsolidated;", "Landroidx/lifecycle/arytenoidectomy;", "attabal", "Landroidx/compose/runtime/unconsolidated;", "dern", "()Landroidx/compose/runtime/unconsolidated;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final unconsolidated<arytenoidectomy> f24100attabal;

    static {
        Object objM3351constructorimpl;
        unconsolidated unconsolidatedVar;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = arytenoidectomy.class.getClassLoader();
            Intrinsics.beachfront(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof unconsolidated) {
                        unconsolidatedVar = (unconsolidated) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof wireman)) {
                    i++;
                }
                unconsolidatedVar = null;
                break;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unconsolidatedVar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        unconsolidated<arytenoidectomy> unconsolidatedVarTaiyuan = (unconsolidated) (Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl);
        if (unconsolidatedVarTaiyuan == null) {
            unconsolidatedVarTaiyuan = stratoscope.taiyuan(new Function0() { // from class: cosy.attabal
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return saneness.saneness();
                }
            });
        }
        f24100attabal = unconsolidatedVarTaiyuan;
    }

    public static final unconsolidated<arytenoidectomy> dern() {
        return f24100attabal;
    }

    public static final arytenoidectomy saneness() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }
}
