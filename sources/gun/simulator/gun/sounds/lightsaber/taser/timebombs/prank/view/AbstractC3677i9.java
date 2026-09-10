package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3677i9 implements InterfaceC2857Wj, InterfaceC4690tk, Serializable {
    private final InterfaceC2857Wj completion;

    public AbstractC3677i9(InterfaceC2857Wj interfaceC2857Wj) {
        this.completion = interfaceC2857Wj;
    }

    public InterfaceC2857Wj create(InterfaceC2857Wj interfaceC2857Wj) {
        AbstractC2995aW.q(interfaceC2857Wj, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.completion;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    public final InterfaceC2857Wj getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        InterfaceC2314Bl interfaceC2314Bl = (InterfaceC2314Bl) getClass().getAnnotation(InterfaceC2314Bl.class);
        String str = null;
        if (interfaceC2314Bl == null) {
            return null;
        }
        int iV = interfaceC2314Bl.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
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
        int i = iIntValue >= 0 ? interfaceC2314Bl.l()[iIntValue] : -1;
        C4568sM c4568sM = BF.e;
        C4568sM c4568sM2 = BF.d;
        if (c4568sM == null) {
            try {
                C4568sM c4568sM3 = new C4568sM(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]), 21);
                BF.e = c4568sM3;
                c4568sM = c4568sM3;
            } catch (Exception unused2) {
                BF.e = c4568sM2;
                c4568sM = c4568sM2;
            }
        }
        if (c4568sM != c4568sM2) {
            Method method = (Method) c4568sM.b;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = (Method) c4568sM.c;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) c4568sM.d;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = interfaceC2314Bl.c();
        } else {
            strC = str + '/' + interfaceC2314Bl.c();
        }
        return new StackTraceElement(strC, interfaceC2314Bl.m(), interfaceC2314Bl.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) {
        InterfaceC2857Wj interfaceC2857Wj = this;
        while (true) {
            AbstractC3677i9 abstractC3677i9 = (AbstractC3677i9) interfaceC2857Wj;
            InterfaceC2857Wj interfaceC2857Wj2 = abstractC3677i9.completion;
            AbstractC2995aW.n(interfaceC2857Wj2);
            try {
                obj = abstractC3677i9.invokeSuspend(obj);
                if (obj == EnumC4602sk.f4993a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC3375el.v(th);
            }
            abstractC3677i9.releaseIntercepted();
            if (!(interfaceC2857Wj2 instanceof AbstractC3677i9)) {
                interfaceC2857Wj2.resumeWith(obj);
                return;
            }
            interfaceC2857Wj = interfaceC2857Wj2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        AbstractC2995aW.q(interfaceC2857Wj, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
