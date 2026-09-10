package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3897kj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4609a = true;
    public String[] b;
    public String[] c;
    public boolean d;

    public final C3985lj a() {
        return new C3985lj(this.f4609a, this.d, this.b, this.c);
    }

    public final void b(C2800Ue... c2800UeArr) {
        AbstractC2995aW.q(c2800UeArr, "cipherSuites");
        if (!this.f4609a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(c2800UeArr.length);
        for (C2800Ue c2800Ue : c2800UeArr) {
            arrayList.add(c2800Ue.f3830a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(String... strArr) {
        AbstractC2995aW.q(strArr, "cipherSuites");
        if (!this.f4609a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.b = (String[]) strArr.clone();
    }

    public final void d() {
        if (!this.f4609a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.d = true;
    }

    public final void e(Oc0... oc0Arr) {
        if (!this.f4609a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(oc0Arr.length);
        for (Oc0 oc0 : oc0Arr) {
            arrayList.add(oc0.f3509a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(String... strArr) {
        AbstractC2995aW.q(strArr, "tlsVersions");
        if (!this.f4609a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.c = (String[]) strArr.clone();
    }
}
