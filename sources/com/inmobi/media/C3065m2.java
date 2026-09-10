package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3065m2 implements wireman {
    public final /* synthetic */ AbstractC3214s2 a;

    public C3065m2(saran saranVar, AbstractC3214s2 abstractC3214s2) {
        this.a = abstractC3214s2;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.a.getClass();
        this.a.e.set(zBooleanValue);
        AbstractC3214s2 abstractC3214s2 = this.a;
        if (abstractC3214s2.e.get()) {
            C3328wg c3328wg = abstractC3214s2.c().a;
            c3328wg.f.set(false);
            c3328wg.a();
        } else {
            C3328wg c3328wg2 = abstractC3214s2.c().a;
            c3328wg2.b.setValue(Mn.HIDDEN);
            c3328wg2.f.set(true);
            H6.a(c3328wg2.e);
            c3328wg2.e = null;
        }
        AbstractC3214s2 abstractC3214s3 = this.a;
        if (abstractC3214s3.e.get()) {
            abstractC3214s3.g.a();
        } else {
            abstractC3214s3.g.b();
        }
        return Unit.f29295attabal;
    }
}
