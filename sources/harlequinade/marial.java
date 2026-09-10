package harlequinade;

import decarock.cuirassed;
import decarock.grimness;
import decarock.stratoscope;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: ProjectionDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {
    public static wireman attabal(byte[] bArr, int i) {
        ArrayList<wireman.attabal> arrayListBeachfront;
        stratoscope stratoscopeVar = new stratoscope(bArr);
        try {
            arrayListBeachfront = dern(stratoscopeVar) ? beachfront(stratoscopeVar) : marial(stratoscopeVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListBeachfront = null;
        }
        if (arrayListBeachfront == null) {
            return null;
        }
        int size = arrayListBeachfront.size();
        if (size == 1) {
            return new wireman(arrayListBeachfront.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new wireman(arrayListBeachfront.get(0), arrayListBeachfront.get(1), i);
    }

    public static ArrayList<wireman.attabal> beachfront(stratoscope stratoscopeVar) {
        int iMonoploid;
        stratoscopeVar.splinterproof(8);
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        while (iBeachfront < iCompetently && (iMonoploid = stratoscopeVar.monoploid() + iBeachfront) > iBeachfront && iMonoploid <= iCompetently) {
            int iMonoploid2 = stratoscopeVar.monoploid();
            if (iMonoploid2 == 2037673328 || iMonoploid2 == 1836279920) {
                stratoscopeVar.peridotite(iMonoploid);
                return marial(stratoscopeVar);
            }
            stratoscopeVar.mathsort(iMonoploid);
            iBeachfront = iMonoploid;
        }
        return null;
    }

    public static ArrayList<wireman.attabal> competently(stratoscope stratoscopeVar) {
        ArrayList<wireman.attabal> arrayList = new ArrayList<>();
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        while (iBeachfront < iCompetently) {
            int iMonoploid = stratoscopeVar.monoploid() + iBeachfront;
            if (iMonoploid <= iBeachfront || iMonoploid > iCompetently) {
                return null;
            }
            if (stratoscopeVar.monoploid() == 1835365224) {
                wireman.attabal attabalVarWireman = wireman(stratoscopeVar);
                if (attabalVarWireman == null) {
                    return null;
                }
                arrayList.add(attabalVarWireman);
            }
            stratoscopeVar.mathsort(iMonoploid);
            iBeachfront = iMonoploid;
        }
        return arrayList;
    }

    public static boolean dern(stratoscope stratoscopeVar) {
        stratoscopeVar.splinterproof(4);
        int iMonoploid = stratoscopeVar.monoploid();
        stratoscopeVar.mathsort(0);
        return iMonoploid == 1886547818;
    }

    public static ArrayList<wireman.attabal> marial(stratoscope stratoscopeVar) {
        if (stratoscopeVar.supplicat() != 0) {
            return null;
        }
        stratoscopeVar.splinterproof(7);
        int iMonoploid = stratoscopeVar.monoploid();
        if (iMonoploid == 1684433976) {
            stratoscope stratoscopeVar2 = new stratoscope();
            Inflater inflater = new Inflater(true);
            try {
                if (!grimness.wostteth(stratoscopeVar, stratoscopeVar2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                stratoscopeVar = stratoscopeVar2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iMonoploid != 1918990112) {
            return null;
        }
        return competently(stratoscopeVar);
    }

    public static int saneness(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static wireman.attabal wireman(stratoscope stratoscopeVar) {
        int iMonoploid = stratoscopeVar.monoploid();
        wireman.attabal attabalVar = null;
        if (iMonoploid > 10000) {
            return null;
        }
        float[] fArr = new float[iMonoploid];
        for (int i = 0; i < iMonoploid; i++) {
            fArr[i] = stratoscopeVar.arytenoidectomy();
        }
        int iMonoploid2 = stratoscopeVar.monoploid();
        if (iMonoploid2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iMonoploid) * 2.0d) / dLog);
        cuirassed cuirassedVar = new cuirassed(stratoscopeVar.marial());
        int i2 = 8;
        cuirassedVar.arytenoidectomy(stratoscopeVar.beachfront() * 8);
        float[] fArr2 = new float[iMonoploid2 * 5];
        int[] iArr = new int[5];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iMonoploid2) {
            wireman.attabal attabalVar2 = attabalVar;
            int i5 = 0;
            while (i5 < 5) {
                int iSaneness = iArr[i5] + saneness(cuirassedVar.impromptu(iCeil));
                if (iSaneness >= iMonoploid || iSaneness < 0) {
                    return attabalVar2;
                }
                fArr2[i4] = fArr[iSaneness];
                iArr[i5] = iSaneness;
                i5++;
                i4++;
            }
            i3++;
            attabalVar = attabalVar2;
        }
        wireman.attabal attabalVar3 = attabalVar;
        cuirassedVar.arytenoidectomy((cuirassedVar.marial() + 7) & (-8));
        int i6 = 32;
        int iImpromptu = cuirassedVar.impromptu(32);
        wireman.saneness[] sanenessVarArr = new wireman.saneness[iImpromptu];
        int i7 = 0;
        while (i7 < iImpromptu) {
            int iImpromptu2 = cuirassedVar.impromptu(i2);
            int iImpromptu3 = cuirassedVar.impromptu(i2);
            int iImpromptu4 = cuirassedVar.impromptu(i6);
            if (iImpromptu4 > 128000) {
                return attabalVar3;
            }
            int i8 = iImpromptu;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iMonoploid2) * d) / dLog);
            float[] fArr3 = new float[iImpromptu4 * 3];
            float[] fArr4 = new float[iImpromptu4 * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < iImpromptu4) {
                int iSaneness2 = i10 + saneness(cuirassedVar.impromptu(iCeil2));
                if (iSaneness2 < 0 || iSaneness2 >= iMonoploid2) {
                    return attabalVar3;
                }
                int i11 = i9 * 3;
                int i12 = iSaneness2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i9 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
                i9++;
                i10 = iSaneness2;
            }
            sanenessVarArr[i7] = new wireman.saneness(iImpromptu2, fArr3, fArr4, iImpromptu3);
            i7++;
            iImpromptu = i8;
            i6 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new wireman.attabal(sanenessVarArr);
    }
}
