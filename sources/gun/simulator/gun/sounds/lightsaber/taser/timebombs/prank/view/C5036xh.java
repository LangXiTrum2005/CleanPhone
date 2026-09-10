package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5036xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5240a;

    public C5036xh(int i) {
        if (i == 1) {
            this.f5240a = new ArrayList();
            return;
        }
        if (i == 2) {
            this.f5240a = new ArrayList();
            return;
        }
        if (i == 3) {
            this.f5240a = new ArrayList();
        } else if (i != 4) {
            this.f5240a = new ArrayList();
        } else {
            this.f5240a = new ArrayList();
        }
    }

    public void a(String str, String str2) {
        AbstractC2995aW.q(str, "name");
        AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C3336eJ.e(str);
        C3336eJ.f(str2, str);
        c(str, str2);
    }

    public void b(String str) {
        int iS0 = AbstractC3089ba0.s0(str, ':', 1, false, 4);
        if (iS0 != -1) {
            String strSubstring = str.substring(0, iS0);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iS0 + 1);
            AbstractC2995aW.p(strSubstring2, "this as java.lang.String).substring(startIndex)");
            c(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            c("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        AbstractC2995aW.p(strSubstring3, "this as java.lang.String).substring(startIndex)");
        c("", strSubstring3);
    }

    public void c(String str, String str2) {
        AbstractC2995aW.q(str, "name");
        AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ArrayList arrayList = this.f5240a;
        arrayList.add(str);
        arrayList.add(AbstractC3089ba0.V0(str2).toString());
    }

    public void d(Path path) {
        ArrayList arrayList = this.f5240a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3362ee0 c3362ee0 = (C3362ee0) arrayList.get(size);
            Xg0 xg0 = AbstractC3014ah0.f4135a;
            if (c3362ee0 != null && !c3362ee0.f4327a) {
                AbstractC3014ah0.a(path, c3362ee0.d.k() / 100.0f, c3362ee0.e.k() / 100.0f, c3362ee0.f.k() / 360.0f);
            }
        }
    }

    public C4447qz e() {
        Object[] array = this.f5240a.toArray(new String[0]);
        if (array != null) {
            return new C4447qz((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public synchronized InterfaceC4230oZ f(Class cls) {
        int size = this.f5240a.size();
        for (int i = 0; i < size; i++) {
            C4318pZ c4318pZ = (C4318pZ) this.f5240a.get(i);
            if (c4318pZ.f4838a.isAssignableFrom(cls)) {
                return c4318pZ.b;
            }
        }
        return null;
    }

    public synchronized InterfaceC4669tZ g(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return G7.l;
        }
        for (Ad0 ad0 : this.f5240a) {
            if (ad0.f2823a.isAssignableFrom(cls) && cls2.isAssignableFrom(ad0.b)) {
                return ad0.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public String h(String str) {
        AbstractC2995aW.q(str, "name");
        ArrayList arrayList = this.f5240a;
        int size = arrayList.size() - 2;
        int iM = AbstractC2995aW.M(size, 0, -2);
        if (iM > size) {
            return null;
        }
        while (true) {
            int i = size - 2;
            if (AbstractC3089ba0.o0(str, (String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
            if (size == iM) {
                return null;
            }
            size = i;
        }
    }

    public synchronized ArrayList i(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (Ad0 ad0 : this.f5240a) {
            if (ad0.f2823a.isAssignableFrom(cls) && cls2.isAssignableFrom(ad0.b) && !arrayList.contains(ad0.b)) {
                arrayList.add(ad0.b);
            }
        }
        return arrayList;
    }

    public void j(String str) {
        AbstractC2995aW.q(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5240a;
            if (i >= arrayList.size()) {
                return;
            }
            if (AbstractC3089ba0.o0(str, (String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public C5036xh() {
        this.f5240a = new ArrayList(20);
    }
}
