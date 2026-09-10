package sg.bigo.ads.core.e.a;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static boolean f = false;
    private static final d g = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f48431c;
    public k d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48432e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<f> f48429a = p.a(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f48430b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f48433h = new Runnable() { // from class: sg.bigo.ads.core.e.a.d.2
        /* JADX WARN: Code duplicated, block: B:106:0x02a6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:42:0x0139  */
        /* JADX WARN: Code duplicated, block: B:44:0x013e  */
        /* JADX WARN: Code duplicated, block: B:46:0x0144  */
        /* JADX WARN: Code duplicated, block: B:48:0x014c  */
        /* JADX WARN: Code duplicated, block: B:49:0x015d  */
        /* JADX WARN: Code duplicated, block: B:52:0x0173  */
        /* JADX WARN: Code duplicated, block: B:54:0x0184  */
        /* JADX WARN: Code duplicated, block: B:55:0x018a  */
        /* JADX WARN: Code duplicated, block: B:57:0x019b  */
        /* JADX WARN: Code duplicated, block: B:63:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:65:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:68:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:71:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:73:0x020a  */
        /* JADX WARN: Code duplicated, block: B:74:0x0213  */
        /* JADX WARN: Code duplicated, block: B:76:0x0224  */
        /* JADX WARN: Code duplicated, block: B:82:0x025c  */
        /* JADX WARN: Code duplicated, block: B:90:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:93:0x02b7  */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x00c5, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x014c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:67:0x01d5, please report this as an issue */
        @Override // java.lang.Runnable
        public final void run() {
            int i2;
            int i3;
            int i4;
            int i5;
            int size;
            String str;
            int size2;
            int iB;
            int i6;
            String str2;
            int size3;
            int iC;
            int i7;
            String str3;
            int size4;
            int iD;
            int i8;
            String str4;
            int i9 = 1;
            int i10 = 0;
            int i11 = 3;
            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "mRetryTrackerRunnable. maybe trackInfoNum=" + d.this.f48429a.size());
            Iterator it = d.this.f48429a.iterator();
            int iB2 = 0;
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i9 = i9;
                    i2 = i10;
                    i3 = i11;
                    break;
                }
                f fVar = (f) it.next();
                Context context = d.this.f48432e;
                if (fVar.s == null) {
                    sg.bigo.ads.common.t.a.b("TrackerInfo", "retryThirdTrackImpl mThirdImpressionTrack is error.");
                } else {
                    if (fVar.a(fVar.f48445i)) {
                        size = fVar.s.size();
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackImpl implTrackNum = ".concat(String.valueOf(size)));
                        if (size != 0) {
                            if (fVar.q.a(fVar.j, System.currentTimeMillis())) {
                                fVar.j = System.currentTimeMillis();
                                fVar.f48445i += i9;
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackImpl mTrytimes = " + fVar.f48445i);
                                fVar.a(context);
                            } else {
                                str = "retryThirdTrackImpl interval limit";
                            }
                        }
                        if (fVar.t == null) {
                            str2 = "retryThirdTrackClick not perform trackThirdClick";
                        } else if (fVar.a(fVar.k)) {
                            size2 = fVar.t.size();
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackClick clickTrackNum = ".concat(String.valueOf(size2)));
                            if (size2 != 0) {
                                iB = i10;
                            } else if (fVar.q.a(fVar.f48446l, System.currentTimeMillis())) {
                                fVar.f48446l = System.currentTimeMillis();
                                fVar.k += i9;
                                iB = fVar.b(context);
                                if (iB == 0 && (i6 = fVar.k) > 0) {
                                    fVar.k = i6 - i9;
                                }
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackClick Real clickTrackNum = ".concat(String.valueOf(iB)));
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackClick mTrytimes = " + fVar.k);
                            } else {
                                str2 = "retryThirdTrackClick interval limit";
                            }
                            if (fVar.f48449u == null) {
                                str3 = "retryBiddingNUrl not perform.";
                            } else {
                                if (fVar.a(fVar.m)) {
                                    size3 = fVar.f48449u.size();
                                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                                    if (size3 == 0) {
                                        i9 = i9;
                                        it = it;
                                    } else {
                                        i9 = i9;
                                        it = it;
                                        if (fVar.q.a(fVar.f48447n, System.currentTimeMillis())) {
                                            fVar.f48447n = System.currentTimeMillis();
                                            fVar.m += i9;
                                            iC = fVar.c(context);
                                            if (iC == 0 && (i7 = fVar.m) > 0) {
                                                fVar.m = i7 - i9;
                                            }
                                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.m);
                                        } else {
                                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl interval limit");
                                        }
                                    }
                                    iC = i10;
                                } else {
                                    str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.m;
                                }
                                if (fVar.v == null) {
                                    str4 = "retryBiddingLUrl not perform.";
                                } else {
                                    if (fVar.a(fVar.o)) {
                                        size4 = fVar.v.size();
                                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                        if (size4 != 0) {
                                            if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                                fVar.f48448p = System.currentTimeMillis();
                                                fVar.o += i9;
                                                iD = fVar.d(context);
                                                if (iD == 0 && (i8 = fVar.o) > 0) {
                                                    fVar.o = i8 - i9;
                                                }
                                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                                i10 = iD;
                                            } else {
                                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                                i10 = 0;
                                            }
                                        }
                                    } else {
                                        str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                                    }
                                    iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                                    if (!fVar.a(fVar.s, fVar.f48445i) && fVar.a(fVar.t, fVar.k) && fVar.a(fVar.f48449u, fVar.m) && fVar.a(fVar.v, fVar.o)) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                        g gVar = g.a.f48453a;
                                        g.b(fVar);
                                        it.remove();
                                        i10 = 0;
                                    } else {
                                        i12 += iB2;
                                        if (i12 > 20) {
                                            i3 = 3;
                                            i2 = 0;
                                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                            iB2 = iB2;
                                            break;
                                        }
                                        i10 = 0;
                                    }
                                    i11 = 3;
                                }
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                                iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                                if (!fVar.a(fVar.s, fVar.f48445i)) {
                                    i12 += iB2;
                                    if (i12 > 20) {
                                        i3 = 3;
                                        i2 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                        iB2 = iB2;
                                        break;
                                    }
                                    i10 = 0;
                                } else {
                                    i12 += iB2;
                                    if (i12 > 20) {
                                        i3 = 3;
                                        i2 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                        iB2 = iB2;
                                        break;
                                    }
                                    i10 = 0;
                                }
                                i11 = 3;
                            }
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str3);
                            i9 = i9;
                            it = it;
                            iC = i10;
                            if (fVar.v == null) {
                                str4 = "retryBiddingLUrl not perform.";
                            } else {
                                if (fVar.a(fVar.o)) {
                                    str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                                } else {
                                    size4 = fVar.v.size();
                                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                    if (size4 != 0) {
                                        if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                            i10 = 0;
                                        } else {
                                            fVar.f48448p = System.currentTimeMillis();
                                            fVar.o += i9;
                                            iD = fVar.d(context);
                                            if (iD == 0) {
                                                fVar.o = i8 - i9;
                                            }
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                            i10 = iD;
                                        }
                                    }
                                }
                                iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                                if (!fVar.a(fVar.s, fVar.f48445i)) {
                                    i12 += iB2;
                                    if (i12 > 20) {
                                        i3 = 3;
                                        i2 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                        iB2 = iB2;
                                        break;
                                    }
                                    i10 = 0;
                                } else {
                                    i12 += iB2;
                                    if (i12 > 20) {
                                        i3 = 3;
                                        i2 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                        iB2 = iB2;
                                        break;
                                    }
                                    i10 = 0;
                                }
                                i11 = 3;
                            }
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                            iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                            if (!fVar.a(fVar.s, fVar.f48445i)) {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            } else {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            }
                            i11 = 3;
                        } else {
                            str2 = "retryThirdTrackClick times limit. mTrytimes = " + fVar.k;
                        }
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str2);
                        iB = i10;
                        if (fVar.f48449u == null) {
                            str3 = "retryBiddingNUrl not perform.";
                        } else {
                            if (fVar.a(fVar.m)) {
                                str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.m;
                            } else {
                                size3 = fVar.f48449u.size();
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                                if (size3 == 0) {
                                    i9 = i9;
                                    it = it;
                                } else {
                                    i9 = i9;
                                    it = it;
                                    if (fVar.q.a(fVar.f48447n, System.currentTimeMillis())) {
                                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl interval limit");
                                    } else {
                                        fVar.f48447n = System.currentTimeMillis();
                                        fVar.m += i9;
                                        iC = fVar.c(context);
                                        if (iC == 0) {
                                            fVar.m = i7 - i9;
                                        }
                                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.m);
                                    }
                                }
                                iC = i10;
                            }
                            if (fVar.v == null) {
                                str4 = "retryBiddingLUrl not perform.";
                            } else {
                                if (fVar.a(fVar.o)) {
                                    str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                                } else {
                                    size4 = fVar.v.size();
                                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                    if (size4 != 0) {
                                        if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                            i10 = 0;
                                        } else {
                                            fVar.f48448p = System.currentTimeMillis();
                                            fVar.o += i9;
                                            iD = fVar.d(context);
                                            if (iD == 0) {
                                                fVar.o = i8 - i9;
                                            }
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                            i10 = iD;
                                        }
                                    }
                                }
                                iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                                if (!fVar.a(fVar.s, fVar.f48445i)) {
                                    i12 += iB2;
                                    if (i12 > 20) {
                                        i3 = 3;
                                        i2 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                        iB2 = iB2;
                                        break;
                                    }
                                    i10 = 0;
                                } else {
                                    i12 += iB2;
                                    if (i12 > 20) {
                                        i3 = 3;
                                        i2 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                        iB2 = iB2;
                                        break;
                                    }
                                    i10 = 0;
                                }
                                i11 = 3;
                            }
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                            iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                            if (!fVar.a(fVar.s, fVar.f48445i)) {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            } else {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            }
                            i11 = 3;
                        }
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str3);
                        i9 = i9;
                        it = it;
                        iC = i10;
                        if (fVar.v == null) {
                            str4 = "retryBiddingLUrl not perform.";
                        } else {
                            if (fVar.a(fVar.o)) {
                                str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                            } else {
                                size4 = fVar.v.size();
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                if (size4 != 0) {
                                    if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                        i10 = 0;
                                    } else {
                                        fVar.f48448p = System.currentTimeMillis();
                                        fVar.o += i9;
                                        iD = fVar.d(context);
                                        if (iD == 0) {
                                            fVar.o = i8 - i9;
                                        }
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                        i10 = iD;
                                    }
                                }
                            }
                            iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                            if (!fVar.a(fVar.s, fVar.f48445i)) {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            } else {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            }
                            i11 = 3;
                        }
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                        iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                        if (!fVar.a(fVar.s, fVar.f48445i)) {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        } else {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        }
                        i11 = 3;
                    } else {
                        str = "retryThirdTrackImpl times limit. mTrytimes = " + fVar.f48445i;
                    }
                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str);
                }
                size = i10;
                if (fVar.t == null) {
                    str2 = "retryThirdTrackClick not perform trackThirdClick";
                } else if (fVar.a(fVar.k)) {
                    str2 = "retryThirdTrackClick times limit. mTrytimes = " + fVar.k;
                } else {
                    size2 = fVar.t.size();
                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackClick clickTrackNum = ".concat(String.valueOf(size2)));
                    if (size2 != 0) {
                        iB = i10;
                    } else if (fVar.q.a(fVar.f48446l, System.currentTimeMillis())) {
                        str2 = "retryThirdTrackClick interval limit";
                    } else {
                        fVar.f48446l = System.currentTimeMillis();
                        fVar.k += i9;
                        iB = fVar.b(context);
                        if (iB == 0) {
                            fVar.k = i6 - i9;
                        }
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackClick Real clickTrackNum = ".concat(String.valueOf(iB)));
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryThirdTrackClick mTrytimes = " + fVar.k);
                    }
                    if (fVar.f48449u == null) {
                        str3 = "retryBiddingNUrl not perform.";
                    } else {
                        if (fVar.a(fVar.m)) {
                            str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.m;
                        } else {
                            size3 = fVar.f48449u.size();
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                            if (size3 == 0) {
                                i9 = i9;
                                it = it;
                            } else {
                                i9 = i9;
                                it = it;
                                if (fVar.q.a(fVar.f48447n, System.currentTimeMillis())) {
                                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl interval limit");
                                } else {
                                    fVar.f48447n = System.currentTimeMillis();
                                    fVar.m += i9;
                                    iC = fVar.c(context);
                                    if (iC == 0) {
                                        fVar.m = i7 - i9;
                                    }
                                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.m);
                                }
                            }
                            iC = i10;
                        }
                        if (fVar.v == null) {
                            str4 = "retryBiddingLUrl not perform.";
                        } else {
                            if (fVar.a(fVar.o)) {
                                str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                            } else {
                                size4 = fVar.v.size();
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                if (size4 != 0) {
                                    if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                        i10 = 0;
                                    } else {
                                        fVar.f48448p = System.currentTimeMillis();
                                        fVar.o += i9;
                                        iD = fVar.d(context);
                                        if (iD == 0) {
                                            fVar.o = i8 - i9;
                                        }
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                        i10 = iD;
                                    }
                                }
                            }
                            iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                            if (!fVar.a(fVar.s, fVar.f48445i)) {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            } else {
                                i12 += iB2;
                                if (i12 > 20) {
                                    i3 = 3;
                                    i2 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                    iB2 = iB2;
                                    break;
                                }
                                i10 = 0;
                            }
                            i11 = 3;
                        }
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                        iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                        if (!fVar.a(fVar.s, fVar.f48445i)) {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        } else {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        }
                        i11 = 3;
                    }
                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str3);
                    i9 = i9;
                    it = it;
                    iC = i10;
                    if (fVar.v == null) {
                        str4 = "retryBiddingLUrl not perform.";
                    } else {
                        if (fVar.a(fVar.o)) {
                            str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                        } else {
                            size4 = fVar.v.size();
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                            if (size4 != 0) {
                                if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                    i10 = 0;
                                } else {
                                    fVar.f48448p = System.currentTimeMillis();
                                    fVar.o += i9;
                                    iD = fVar.d(context);
                                    if (iD == 0) {
                                        fVar.o = i8 - i9;
                                    }
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                    i10 = iD;
                                }
                            }
                        }
                        iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                        if (!fVar.a(fVar.s, fVar.f48445i)) {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        } else {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        }
                        i11 = 3;
                    }
                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                    iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                    if (!fVar.a(fVar.s, fVar.f48445i)) {
                        i12 += iB2;
                        if (i12 > 20) {
                            i3 = 3;
                            i2 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                            iB2 = iB2;
                            break;
                        }
                        i10 = 0;
                    } else {
                        i12 += iB2;
                        if (i12 > 20) {
                            i3 = 3;
                            i2 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                            iB2 = iB2;
                            break;
                        }
                        i10 = 0;
                    }
                    i11 = 3;
                }
                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str2);
                iB = i10;
                if (fVar.f48449u == null) {
                    str3 = "retryBiddingNUrl not perform.";
                } else {
                    if (fVar.a(fVar.m)) {
                        str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.m;
                    } else {
                        size3 = fVar.f48449u.size();
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                        if (size3 == 0) {
                            i9 = i9;
                            it = it;
                        } else {
                            i9 = i9;
                            it = it;
                            if (fVar.q.a(fVar.f48447n, System.currentTimeMillis())) {
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl interval limit");
                            } else {
                                fVar.f48447n = System.currentTimeMillis();
                                fVar.m += i9;
                                iC = fVar.c(context);
                                if (iC == 0) {
                                    fVar.m = i7 - i9;
                                }
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.m);
                            }
                        }
                        iC = i10;
                    }
                    if (fVar.v == null) {
                        str4 = "retryBiddingLUrl not perform.";
                    } else {
                        if (fVar.a(fVar.o)) {
                            str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                        } else {
                            size4 = fVar.v.size();
                            sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                            if (size4 != 0) {
                                if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                    i10 = 0;
                                } else {
                                    fVar.f48448p = System.currentTimeMillis();
                                    fVar.o += i9;
                                    iD = fVar.d(context);
                                    if (iD == 0) {
                                        fVar.o = i8 - i9;
                                    }
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                    i10 = iD;
                                }
                            }
                        }
                        iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                        if (!fVar.a(fVar.s, fVar.f48445i)) {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        } else {
                            i12 += iB2;
                            if (i12 > 20) {
                                i3 = 3;
                                i2 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                                iB2 = iB2;
                                break;
                            }
                            i10 = 0;
                        }
                        i11 = 3;
                    }
                    sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                    iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                    if (!fVar.a(fVar.s, fVar.f48445i)) {
                        i12 += iB2;
                        if (i12 > 20) {
                            i3 = 3;
                            i2 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                            iB2 = iB2;
                            break;
                        }
                        i10 = 0;
                    } else {
                        i12 += iB2;
                        if (i12 > 20) {
                            i3 = 3;
                            i2 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                            iB2 = iB2;
                            break;
                        }
                        i10 = 0;
                    }
                    i11 = 3;
                }
                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str3);
                i9 = i9;
                it = it;
                iC = i10;
                if (fVar.v == null) {
                    str4 = "retryBiddingLUrl not perform.";
                } else {
                    if (fVar.a(fVar.o)) {
                        str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.o;
                    } else {
                        size4 = fVar.v.size();
                        sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                        if (size4 != 0) {
                            if (fVar.q.a(fVar.f48448p, System.currentTimeMillis())) {
                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                i10 = 0;
                            } else {
                                fVar.f48448p = System.currentTimeMillis();
                                fVar.o += i9;
                                iD = fVar.d(context);
                                if (iD == 0) {
                                    fVar.o = i8 - i9;
                                }
                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.o);
                                i10 = iD;
                            }
                        }
                    }
                    iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                    if (!fVar.a(fVar.s, fVar.f48445i)) {
                        i12 += iB2;
                        if (i12 > 20) {
                            i3 = 3;
                            i2 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                            iB2 = iB2;
                            break;
                        }
                        i10 = 0;
                    } else {
                        i12 += iB2;
                        if (i12 > 20) {
                            i3 = 3;
                            i2 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                            iB2 = iB2;
                            break;
                        }
                        i10 = 0;
                    }
                    i11 = 3;
                }
                sg.bigo.ads.common.t.a.a(i10, i11, "TrackerInfo", str4);
                iB2 = android.support.v4.media.a.b(size, iB, iC, i10);
                if (!fVar.a(fVar.s, fVar.f48445i)) {
                    i12 += iB2;
                    if (i12 > 20) {
                        i3 = 3;
                        i2 = 0;
                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                        iB2 = iB2;
                        break;
                    }
                    i10 = 0;
                } else {
                    i12 += iB2;
                    if (i12 > 20) {
                        i3 = 3;
                        i2 = 0;
                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i12)));
                        iB2 = iB2;
                        break;
                    }
                    i10 = 0;
                }
                i11 = 3;
            }
            sg.bigo.ads.common.t.a.a(i2, i3, "RetryTrackerManager", "mRetryTrackerRunnable. actually trackNum=".concat(String.valueOf(iB2)));
            if (d.this.f48429a.size() == 0) {
                Set set = d.this.f48429a;
                g gVar2 = g.a.f48453a;
                set.addAll(g.a(1800000L, d.this.f48431c));
                i4 = 3;
                i5 = 0;
                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "mRetryTrackerRunnable. append, trackers=" + d.this.f48429a.size());
            } else {
                i4 = 3;
                i5 = 0;
            }
            sg.bigo.ads.common.t.a.a(i5, i4, "RetryTrackerManager", "mRetryTrackerRunnable.trackers=" + d.this.f48429a.size());
            if (d.this.f48429a.size() > 0) {
                sg.bigo.ads.common.n.d.a(i9, d.this.f48433h, 20000L);
            } else {
                sg.bigo.ads.common.t.a.a(i5, i4, "RetryTrackerManager", "mRetryTrackerRunnable. stop looping");
                d.c();
            }
        }
    };

    public static d a() {
        return g;
    }

    public static /* synthetic */ boolean c() {
        f = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f = true;
        b();
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "startCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(1, this.f48433h, 20000L);
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "stopCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(this.f48433h);
    }

    public final void a(f fVar) {
        if (!f) {
            d();
        }
        this.f48429a.add(fVar);
        g gVar = g.a.f48453a;
        g.a(fVar);
    }

    public final void b(final f fVar) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.a.f48453a;
                g.b(fVar);
            }
        });
    }
}
