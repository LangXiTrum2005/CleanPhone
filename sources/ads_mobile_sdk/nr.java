package ads_mobile_sdk;

import org.jacoco.core.runtime.AgentOptions;
import saneness.attraction;
import saneness.vavasour;

/* JADX INFO: loaded from: classes.dex */
public final class nr implements vavasour {
    public final mr a;

    public nr(mr mrVar) {
        mr mrVar2 = (mr) r21.a(mrVar, AgentOptions.OUTPUT);
        this.a = mrVar2;
        mrVar2.a = this;
    }

    public final void a(int i, boolean z) {
        this.a.a(i, z);
    }

    public final void b(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void c(int i, int i2) {
        this.a.f(i, i2);
    }

    public final void d(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void e(int i, int i2) {
        this.a.h(i, mr.j(i2));
    }

    public final void f(int i, int i2) {
        this.a.h(i, i2);
    }

    public final void a(int i, kn knVar) {
        this.a.b(i, knVar);
    }

    public final void b(int i, long j) {
        this.a.e(i, j);
    }

    public final void c(int i, long j) {
        this.a.d(i, j);
    }

    public final void a(int i, double d) {
        mr mrVar = this.a;
        mrVar.getClass();
        mrVar.d(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, long j) {
        this.a.e(i, mr.b(j));
    }

    public final void b(int i, attraction attractionVar, Object obj) {
        g gVar = (g) obj;
        this.a.g(i, 2);
        this.a.m(gVar.a(attractionVar));
        attractionVar.a((Object) gVar, (vavasour) this);
    }

    public final void e(int i, long j) {
        this.a.e(i, j);
    }

    public final void a(int i, int i2) {
        this.a.f(i, i2);
    }

    public final void a(int i, long j) {
        this.a.d(i, j);
    }

    public final void a(int i, float f) {
        mr mrVar = this.a;
        mrVar.getClass();
        mrVar.e(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, attraction attractionVar, Object obj) {
        this.a.g(i, 3);
        attractionVar.a(obj, (vavasour) this);
        this.a.g(i, 4);
    }
}
