package emmesh;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kurbash.formularize;
import kurbash.impromptu;
import kurbash.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.KCallableImpl;
import p002kotlin.reflect.jvm.internal.molybdenite;

/* JADX INFO: compiled from: KCallablesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkurbash/dern;", "", "value", "attabal", "(Lkurbash/dern;)Z", "setAccessible", "(Lkurbash/dern;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class attabal {
    public static final boolean attabal(kurbash.dern<?> dernVar) {
        p002kotlin.reflect.jvm.internal.calls.dern<?> dernVarRotuma;
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        if (dernVar instanceof taiyuan) {
            formularize formularizeVar = (formularize) dernVar;
            Field fieldSaneness = dern.saneness(formularizeVar);
            if (fieldSaneness != null ? fieldSaneness.isAccessible() : true) {
                Method methodDern = dern.dern(formularizeVar);
                if (methodDern != null ? methodDern.isAccessible() : true) {
                    Method methodMarial = dern.marial((taiyuan) dernVar);
                    if (methodMarial != null ? methodMarial.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (dernVar instanceof formularize) {
            formularize formularizeVar2 = (formularize) dernVar;
            Field fieldSaneness2 = dern.saneness(formularizeVar2);
            if (fieldSaneness2 != null ? fieldSaneness2.isAccessible() : true) {
                Method methodDern2 = dern.dern(formularizeVar2);
                if (methodDern2 != null ? methodDern2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (dernVar instanceof formularize.saneness) {
            Field fieldSaneness3 = dern.saneness(((formularize.saneness) dernVar).competently());
            if (fieldSaneness3 != null ? fieldSaneness3.isAccessible() : true) {
                Method methodWireman = dern.wireman((impromptu) dernVar);
                if (methodWireman != null ? methodWireman.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (dernVar instanceof taiyuan.attabal) {
            Field fieldSaneness4 = dern.saneness(((taiyuan.attabal) dernVar).competently());
            if (fieldSaneness4 != null ? fieldSaneness4.isAccessible() : true) {
                Method methodWireman2 = dern.wireman((impromptu) dernVar);
                if (methodWireman2 != null ? methodWireman2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(dernVar instanceof impromptu)) {
            throw new UnsupportedOperationException("Unknown callable: " + dernVar + " (" + dernVar.getClass() + ')');
        }
        impromptu impromptuVar = (impromptu) dernVar;
        Method methodWireman3 = dern.wireman(impromptuVar);
        if (methodWireman3 != null ? methodWireman3.isAccessible() : true) {
            KCallableImpl<?> kCallableImplSaneness = molybdenite.saneness(dernVar);
            Member memberSaneness = (kCallableImplSaneness == null || (dernVarRotuma = kCallableImplSaneness.rotuma()) == null) ? null : dernVarRotuma.saneness();
            AccessibleObject accessibleObject = memberSaneness instanceof AccessibleObject ? (AccessibleObject) memberSaneness : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorAttabal = dern.attabal(impromptuVar);
                if (constructorAttabal != null ? constructorAttabal.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
