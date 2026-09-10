package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;

/* JADX INFO: renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3334wm {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3159pl c3159pl, double d, Pe pe, int i, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        C3185qm c3185qm;
        double d2;
        if (continuationImpl instanceof C3185qm) {
            c3185qm = (C3185qm) continuationImpl;
            int i2 = c3185qm.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3185qm.e = i2 - Integer.MIN_VALUE;
            } else {
                c3185qm = new C3185qm(continuationImpl);
            }
        } else {
            c3185qm = new C3185qm(continuationImpl);
        }
        Object objA = c3185qm.d;
        Object objBeachfront = attabal.beachfront();
        int i3 = c3185qm.e;
        if (i3 == 0) {
            dern.saneness(objA);
            c3185qm.a = c3159pl;
            c3185qm.b = pe;
            c3185qm.c = i;
            c3185qm.e = 1;
            objA = a(c3159pl, d, vastVideoConfig, c3185qm);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c3185qm.c;
            pe = c3185qm.b;
            c3159pl = c3185qm.a;
            dern.saneness(objA);
        }
        double dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue == Double.MAX_VALUE) {
            return igo.attabal.saneness(Double.MAX_VALUE);
        }
        double dAbs = Math.abs((c3159pl.a * c3159pl.b) - i);
        int iOrdinal = pe.ordinal();
        if (iOrdinal != 2) {
            d2 = iOrdinal != 3 ? 0.5d : 1.5d;
        } else {
            d2 = 1.0d;
        }
        return igo.attabal.saneness((dAbs * d2) / Math.exp(dDoubleValue / 3.145728E7d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3159pl c3159pl, double d, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        C3209rm c3209rm;
        double dDoubleValue;
        if (continuationImpl instanceof C3209rm) {
            c3209rm = (C3209rm) continuationImpl;
            int i = c3209rm.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3209rm.c = i - Integer.MIN_VALUE;
            } else {
                c3209rm = new C3209rm(continuationImpl);
            }
        } else {
            c3209rm = new C3209rm(continuationImpl);
        }
        Object objA = c3209rm.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3209rm.c;
        double d2 = Double.MAX_VALUE;
        if (i2 == 0) {
            dern.saneness(objA);
            dDoubleValue = ((double) c3159pl.d) * d;
            if (dDoubleValue <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                return igo.attabal.saneness(Double.MAX_VALUE);
            }
            if (dDoubleValue <= 0.0d) {
                c3209rm.a = vastVideoConfig;
                c3209rm.c = 1;
                objA = a(c3159pl, vastVideoConfig, c3209rm);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            }
            if (dDoubleValue > 0.0d && dDoubleValue <= vastVideoConfig.getVastMaxAssetSize()) {
                d2 = dDoubleValue;
            }
            return igo.attabal.saneness(d2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vastVideoConfig = c3209rm.a;
        dern.saneness(objA);
        dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue > 0.0d) {
            d2 = dDoubleValue;
        }
        return igo.attabal.saneness(d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3159pl c3159pl, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        C3234sm c3234sm;
        Ne ne;
        if (continuationImpl instanceof C3234sm) {
            c3234sm = (C3234sm) continuationImpl;
            int i = c3234sm.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3234sm.b = i - Integer.MIN_VALUE;
            } else {
                c3234sm = new C3234sm(continuationImpl);
            }
        } else {
            c3234sm = new C3234sm(continuationImpl);
        }
        Object objA = c3234sm.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3234sm.b;
        try {
            if (i2 == 0) {
                dern.saneness(objA);
                Ke ke = new Ke(c3159pl.c, new C3158pk(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                C3271u9 c3271u9 = (C3271u9) He.c.getValue();
                c3234sm.b = 1;
                objA = c3271u9.a.a(ke, c3234sm);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dern.saneness(objA);
            }
            ne = (Ne) objA;
        } catch (Exception unused) {
            ne = null;
        }
        if (ne != null && ne.c() == 200) {
            return igo.attabal.saneness(ne.b().c);
        }
        return igo.attabal.saneness(Double.MAX_VALUE);
    }
}
