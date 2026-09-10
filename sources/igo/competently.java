package igo;

import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Ligo/competently;", "", "<init>", "()V", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "continuation", "", "saneness", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/String;", "Ligo/competently$attabal;", "attabal", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ligo/competently$attabal;", "Ligo/competently$attabal;", "notOnJava9", "dern", "cache", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static attabal cache;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f28404attabal = new competently();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final attabal notOnJava9 = new attabal(null, null, null);

    /* JADX INFO: compiled from: DebugMetadata.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ligo/competently$attabal;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "attabal", "Ljava/lang/reflect/Method;", "saneness", "dern", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Method getModuleMethod;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final Method nameMethod;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final Method getDescriptorMethod;

        public attabal(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    public final attabal attabal(BaseContinuationImpl continuation) {
        try {
            attabal attabalVar = new attabal(Class.class.getDeclaredMethod("getModule", null), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            cache = attabalVar;
            return attabalVar;
        } catch (Exception unused) {
            attabal attabalVar2 = notOnJava9;
            cache = attabalVar2;
            return attabalVar2;
        }
    }

    public final String saneness(BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        attabal attabalVarAttabal = cache;
        if (attabalVarAttabal == null) {
            attabalVarAttabal = attabal(continuation);
        }
        if (attabalVarAttabal != notOnJava9 && (method = attabalVarAttabal.getModuleMethod) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = attabalVarAttabal.getDescriptorMethod) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = attabalVarAttabal.nameMethod;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
