package alloy;

import androidx.media3.extractor.flv.TagPayloadReader;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.impassible;
import decarock.stratoscope;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern extends TagPayloadReader {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long[] f3943dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f3944saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long[] f3945wireman;

    public dern() {
        super(new impassible());
        this.f3944saneness = C.TIME_UNSET;
        this.f3943dern = new long[0];
        this.f3945wireman = new long[0];
    }

    public static HashMap<String, Object> apical(stratoscope stratoscopeVar) {
        int iSeminary = stratoscopeVar.seminary();
        HashMap<String, Object> map = new HashMap<>(iSeminary);
        for (int i = 0; i < iSeminary; i++) {
            String strTriweekly = triweekly(stratoscopeVar);
            Object objImpromptu = impromptu(stratoscopeVar, kowloon(stratoscopeVar));
            if (objImpromptu != null) {
                map.put(strTriweekly, objImpromptu);
            }
        }
        return map;
    }

    public static Boolean competently(stratoscope stratoscopeVar) {
        return Boolean.valueOf(stratoscopeVar.supplicat() == 1);
    }

    public static Double cutely(stratoscope stratoscopeVar) {
        return Double.valueOf(Double.longBitsToDouble(stratoscopeVar.cuirassed()));
    }

    public static HashMap<String, Object> formularize(stratoscope stratoscopeVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strTriweekly = triweekly(stratoscopeVar);
            int iKowloon = kowloon(stratoscopeVar);
            if (iKowloon == 9) {
                return map;
            }
            Object objImpromptu = impromptu(stratoscopeVar, iKowloon);
            if (objImpromptu != null) {
                map.put(strTriweekly, objImpromptu);
            }
        }
    }

    public static ArrayList<Object> impassible(stratoscope stratoscopeVar) {
        int iSeminary = stratoscopeVar.seminary();
        ArrayList<Object> arrayList = new ArrayList<>(iSeminary);
        for (int i = 0; i < iSeminary; i++) {
            Object objImpromptu = impromptu(stratoscopeVar, kowloon(stratoscopeVar));
            if (objImpromptu != null) {
                arrayList.add(objImpromptu);
            }
        }
        return arrayList;
    }

    public static Object impromptu(stratoscope stratoscopeVar, int i) {
        if (i == 0) {
            return cutely(stratoscopeVar);
        }
        if (i == 1) {
            return competently(stratoscopeVar);
        }
        if (i == 2) {
            return triweekly(stratoscopeVar);
        }
        if (i == 3) {
            return formularize(stratoscopeVar);
        }
        if (i == 8) {
            return apical(stratoscopeVar);
        }
        if (i == 10) {
            return impassible(stratoscopeVar);
        }
        if (i != 11) {
            return null;
        }
        return taiyuan(stratoscopeVar);
    }

    public static int kowloon(stratoscope stratoscopeVar) {
        return stratoscopeVar.supplicat();
    }

    public static Date taiyuan(stratoscope stratoscopeVar) {
        Date date = new Date((long) cutely(stratoscopeVar).doubleValue());
        stratoscopeVar.splinterproof(2);
        return date;
    }

    public static String triweekly(stratoscope stratoscopeVar) {
        int iSaran = stratoscopeVar.saran();
        int iBeachfront = stratoscopeVar.beachfront();
        stratoscopeVar.splinterproof(iSaran);
        return new String(stratoscopeVar.marial(), iBeachfront, iSaran);
    }

    public long[] beachfront() {
        return this.f3943dern;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean dern(stratoscope stratoscopeVar, long j) {
        if (kowloon(stratoscopeVar) != 2 || !"onMetaData".equals(triweekly(stratoscopeVar)) || stratoscopeVar.attabal() == 0 || kowloon(stratoscopeVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapApical = apical(stratoscopeVar);
        Object obj = mapApical.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f3944saneness = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapApical.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f3943dern = new long[size];
                this.f3945wireman = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f3943dern = new long[0];
                        this.f3945wireman = new long[0];
                        break;
                    }
                    this.f3943dern[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f3945wireman[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long[] marial() {
        return this.f3945wireman;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean saneness(stratoscope stratoscopeVar) {
        return true;
    }

    public long wireman() {
        return this.f3944saneness;
    }
}
