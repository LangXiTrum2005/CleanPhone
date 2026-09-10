package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements qk.c, Serializable {
    public static final Object NO_RECEIVER = c.f44759a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient qk.c reflected;
    private final String signature;

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // qk.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // qk.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public qk.c compute() {
        qk.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        qk.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract qk.c computeReflected();

    @Override // qk.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // qk.c
    public String getName() {
        return this.name;
    }

    public qk.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? d0.f44761a.c(cls, "") : d0.f44761a.b(cls);
    }

    @Override // qk.c
    public List<qk.o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract qk.c getReflected();

    @Override // qk.c
    public qk.x getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // qk.c
    public List<qk.y> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // qk.c
    public qk.c0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // qk.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // qk.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // qk.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // qk.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
