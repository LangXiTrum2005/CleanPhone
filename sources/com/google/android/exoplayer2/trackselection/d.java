package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ DefaultTrackSelector X;

    public /* synthetic */ d(DefaultTrackSelector defaultTrackSelector) {
        this.X = defaultTrackSelector;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0091  */
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean z2;
        DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV33;
        boolean z3 = false;
        byte b2 = 2;
        DefaultTrackSelector defaultTrackSelector = this.X;
        Format format = (Format) obj;
        synchronized (defaultTrackSelector.f18668c) {
            try {
                if (!defaultTrackSelector.g.K0 || defaultTrackSelector.f || format.z0 <= 2) {
                    z3 = true;
                } else {
                    String str = format.m0;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                b2 = !str.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                                break;
                            case 187078296:
                                b2 = !str.equals("audio/ac3") ? (byte) -1 : (byte) 1;
                                break;
                            case 187078297:
                                if (!str.equals("audio/ac4")) {
                                    b2 = -1;
                                }
                                break;
                            case 1504578661:
                                b2 = !str.equals("audio/eac3") ? (byte) -1 : (byte) 3;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                z2 = true;
                                break;
                            default:
                                z2 = false;
                                break;
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2 && (Util.f18979a < 32 || (spatializerWrapperV33 = defaultTrackSelector.f18670h) == null || !spatializerWrapperV33.f18682b)) {
                        z3 = true;
                    } else if (Util.f18979a >= 32 && (spatializerWrapperV32 = defaultTrackSelector.f18670h) != null && spatializerWrapperV32.f18682b && spatializerWrapperV32.f18681a.isAvailable() && defaultTrackSelector.f18670h.f18681a.isEnabled() && defaultTrackSelector.f18670h.a(format, defaultTrackSelector.f18671i)) {
                        z3 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
