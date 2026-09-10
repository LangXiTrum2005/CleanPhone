package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class P70 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3540a;

    public /* synthetic */ P70(int i) {
        this.f3540a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2750Sg c2750Sg = AbstractC2802Ug.f3832a;
        switch (this.f3540a) {
            case 0:
                SlowMotionData.Segment segment = (SlowMotionData.Segment) obj;
                SlowMotionData.Segment segment2 = (SlowMotionData.Segment) obj2;
                return c2750Sg.b(segment.startTimeMs, segment2.startTimeMs).b(segment.endTimeMs, segment2.endTimeMs).a(segment.speedDivisor, segment2.speedDivisor).f();
            case 1:
                U9 u9 = (U9) obj;
                U9 u10 = (U9) obj2;
                int iCompare = Integer.compare(u9.c, u10.c);
                return iCompare != 0 ? iCompare : u9.b.compareTo(u10.b);
            case 2:
                return I00.b(((H00) obj).f3148a.c, ((H00) obj2).f3148a.c);
            case 3:
                return Integer.compare(((C3711id) obj2).b, ((C3711id) obj).b);
            case 4:
                return Integer.compare(((Ll0) obj).f3371a.b, ((Ll0) obj2).f3371a.b);
            case 5:
                return Long.compare(((Kl0) obj).b, ((Kl0) obj2).b);
            case 6:
                return ((C4619sw) obj2).h - ((C4619sw) obj).h;
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                AbstractC2992aT abstractC2992aT = C3557go.j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                AbstractC2992aT abstractC2992aT2 = C3557go.j;
                return 0;
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C2750Sg.g(new P70(14).compare((C3469fo) Collections.max(list, new P70(12)), (C3469fo) Collections.max(list2, new P70(13)))).a(list.size(), list2.size()).c((C3469fo) Collections.max(list, new P70(15)), (C3469fo) Collections.max(list2, new P70(16)), new P70(17)).f();
            case 10:
                return ((C2861Wn) Collections.max((List) obj)).compareTo((C2861Wn) Collections.max((List) obj2));
            case 11:
                return ((C3204co) ((List) obj).get(0)).compareTo((C3204co) ((List) obj2).get(0));
            case 12:
                return C3469fo.d((C3469fo) obj, (C3469fo) obj2);
            case 13:
                return C3469fo.d((C3469fo) obj, (C3469fo) obj2);
            case 14:
                return C3469fo.d((C3469fo) obj, (C3469fo) obj2);
            case 15:
                return C3469fo.c((C3469fo) obj, (C3469fo) obj2);
            case 16:
                return C3469fo.c((C3469fo) obj, (C3469fo) obj2);
            case 17:
                return C3469fo.c((C3469fo) obj, (C3469fo) obj2);
            case 18:
                C3938l80 c3938l80 = (C3938l80) obj;
                C3938l80 c3938l81 = (C3938l80) obj2;
                int iCompare2 = Integer.compare(c3938l81.b, c3938l80.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = c3938l80.c.compareTo(c3938l81.c);
                return iCompareTo != 0 ? iCompareTo : c3938l80.d.compareTo(c3938l81.d);
            case 19:
                C3938l80 c3938l82 = (C3938l80) obj;
                C3938l80 c3938l83 = (C3938l80) obj2;
                int iCompare3 = Integer.compare(c3938l83.f4635a, c3938l82.f4635a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = c3938l83.c.compareTo(c3938l82.c);
                return iCompareTo2 != 0 ? iCompareTo2 : c3938l83.d.compareTo(c3938l82.d);
            case 20:
                return ((L70) obj).f3340a - ((L70) obj2).f3340a;
            case 21:
                return Float.compare(((L70) obj).c, ((L70) obj2).c);
            case 22:
                return ((Double) obj).compareTo((Double) obj2);
            default:
                Integer num3 = C4663tT.s;
                return Integer.compare(((C3784jT) obj2).g, ((C3784jT) obj).g);
        }
    }
}
