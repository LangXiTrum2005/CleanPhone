package ck;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements ak.f, d, Serializable {
    private final ak.f completion;

    public a(ak.f fVar) {
        this.completion = fVar;
    }

    public ak.f create(ak.f completion) {
        n.f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // ck.d
    public d getCallerFrame() {
        ak.f fVar = this.completion;
        if (fVar instanceof d) {
            return (d) fVar;
        }
        return null;
    }

    public final ak.f getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        v9.e eVar2 = f.f6471b;
        v9.e eVar3 = f.f6470a;
        if (eVar2 == null) {
            try {
                v9.e eVar4 = new v9.e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), false, 3);
                f.f6471b = eVar4;
                eVar2 = eVar4;
            } catch (Exception unused2) {
                f.f6471b = eVar3;
                eVar2 = eVar3;
            }
        }
        if (eVar2 != eVar3 && (method = (Method) eVar2.f52503b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) eVar2.f52504c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) eVar2.f52505d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // ak.f
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            a aVar = (a) r2;
            ak.f fVar = aVar.completion;
            n.c(fVar);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == bk.a.f5708a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = t9.e.c(th2);
            }
            aVar.releaseIntercepted();
            if (!(fVar instanceof a)) {
                fVar.resumeWith(obj);
                return;
            }
            r2 = fVar;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ak.f create(Object obj, ak.f completion) {
        n.f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
