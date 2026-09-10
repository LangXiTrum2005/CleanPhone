package nattier;

import cybernatic.saran;
import decarock.stratoscope;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f33830attabal = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean attabal(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f33830attabal) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e A[RETURN] */
    public static saran dern(cybernatic.monoploid monoploidVar, boolean z, boolean z2) throws IOException {
        saran saranVar;
        int i;
        int i2;
        int i3;
        int[] iArr;
        long length = monoploidVar.getLength();
        long j = -1;
        long j2 = 4096;
        if (length != -1 && length <= 4096) {
            j2 = length;
        }
        int i4 = (int) j2;
        stratoscope stratoscopeVar = new stratoscope(64);
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        while (true) {
            if (i6 < i4) {
                stratoscopeVar.starveling(8);
                boolean z4 = true;
                if (monoploidVar.peekFully(stratoscopeVar.marial(), i5, 8, true)) {
                    long jMerc = stratoscopeVar.merc();
                    int iMonoploid = stratoscopeVar.monoploid();
                    if (jMerc == 1) {
                        j = j;
                        monoploidVar.peekFully(stratoscopeVar.marial(), 8, 8);
                        i2 = 16;
                        stratoscopeVar.peridotite(16);
                        jMerc = stratoscopeVar.cuirassed();
                        i6 = i6;
                    } else {
                        j = j;
                        if (jMerc == 0) {
                            long length2 = monoploidVar.getLength();
                            if (length2 != j) {
                                jMerc = (length2 - monoploidVar.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i2 = 8;
                    }
                    long j3 = jMerc;
                    long j4 = i2;
                    if (j3 < j4) {
                        return new dern(iMonoploid, j3, i2);
                    }
                    int i7 = i6 + i2;
                    saranVar = null;
                    if (iMonoploid == 1836019574) {
                        i4 += (int) j3;
                        if (length != -1 && i4 > length) {
                            i4 = (int) length;
                        }
                        i6 = i7;
                        i5 = 0;
                    } else if (iMonoploid == 1836019558 || iMonoploid == 1836475768) {
                        i = 1;
                    } else {
                        if (iMonoploid == 1835295092) {
                            z3 = true;
                        }
                        long j5 = length;
                        if ((((long) i7) + j3) - j4 >= i4) {
                            i = 0;
                        } else {
                            int i8 = (int) (j3 - j4);
                            i6 = i7 + i8;
                            if (iMonoploid != 1718909296) {
                                i3 = 0;
                                if (i8 != 0) {
                                    monoploidVar.advancePeekPosition(i8);
                                }
                            } else {
                                if (i8 < 8) {
                                    return new dern(iMonoploid, i8, 8);
                                }
                                stratoscopeVar.starveling(i8);
                                i3 = 0;
                                monoploidVar.peekFully(stratoscopeVar.marial(), 0, i8);
                                int iMonoploid2 = stratoscopeVar.monoploid();
                                if (attabal(iMonoploid2, z2)) {
                                    z3 = true;
                                }
                                stratoscopeVar.splinterproof(4);
                                int iAttabal = stratoscopeVar.attabal() / 4;
                                if (!z3 && iAttabal > 0) {
                                    iArr = new int[iAttabal];
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= iAttabal) {
                                            z4 = z3;
                                            break;
                                        }
                                        int iMonoploid3 = stratoscopeVar.monoploid();
                                        iArr[i9] = iMonoploid3;
                                        if (attabal(iMonoploid3, z2)) {
                                            break;
                                        }
                                        i9++;
                                    }
                                } else {
                                    z4 = z3;
                                    iArr = null;
                                }
                                if (!z4) {
                                    return new gintrap(iMonoploid2, iArr);
                                }
                                z3 = z4;
                            }
                            i5 = i3;
                            length = j5;
                        }
                    }
                }
                if (!z3) {
                    return triweekly.f33863attabal;
                }
                if (z != i) {
                    return i != 0 ? taiyuan.f33861saneness : taiyuan.f33860dern;
                }
                return saranVar;
            }
            saranVar = null;
            i = i5;
            if (!z3) {
                return triweekly.f33863attabal;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return saranVar;
        }
    }

    public static saran saneness(cybernatic.monoploid monoploidVar) throws IOException {
        return dern(monoploidVar, true, false);
    }

    public static saran wireman(cybernatic.monoploid monoploidVar, boolean z) throws IOException {
        return dern(monoploidVar, false, z);
    }
}
