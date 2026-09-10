package p002kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes5.dex */
public class attabal implements InvocationHandler {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class f29578attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f29579dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List f29580marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map f29581saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f29582wireman;

    public attabal(Class cls, Map map, taiyuan taiyuanVar, taiyuan taiyuanVar2, List list) {
        this.f29578attabal = cls;
        this.f29581saneness = map;
        this.f29579dern = taiyuanVar;
        this.f29582wireman = taiyuanVar2;
        this.f29580marial = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AnnotationConstructorCallerKt.taiyuan(this.f29578attabal, this.f29581saneness, this.f29579dern, this.f29582wireman, this.f29580marial, obj, method, objArr);
    }
}
