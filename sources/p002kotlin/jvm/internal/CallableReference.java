package p002kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kurbash.arytenoidectomy;
import kurbash.competently;
import kurbash.dern;
import kurbash.monoploid;
import p002kotlin.jvm.KotlinReflectionNotSupportedError;
import p002kotlin.reflect.KParameter;
import p002kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CallableReference implements dern, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f29372kowloon;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient dern reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final NoReceiver f29372kowloon = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f29372kowloon;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // kurbash.dern
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kurbash.dern
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public dern compute() {
        dern dernVar = this.reflected;
        if (dernVar != null) {
            return dernVar;
        }
        dern dernVarComputeReflected = computeReflected();
        this.reflected = dernVarComputeReflected;
        return dernVarComputeReflected;
    }

    public abstract dern computeReflected();

    @Override // kurbash.saneness
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kurbash.dern
    public String getName() {
        return this.name;
    }

    public competently getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? polloi.dern(cls) : polloi.saneness(cls);
    }

    @Override // kurbash.dern
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    public dern getReflected() {
        dern dernVarCompute = compute();
        if (dernVarCompute != this) {
            return dernVarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kurbash.dern
    public arytenoidectomy getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kurbash.dern
    public List<monoploid> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kurbash.dern
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kurbash.dern
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kurbash.dern
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kurbash.dern
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kurbash.dern
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
