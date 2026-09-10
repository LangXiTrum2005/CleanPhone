package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2847Vz extends AbstractC2873Wz {
    public static final C2847Vz n = new C2847Vz("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final C4619sw j;
    public final List k;
    public final Map l;
    public final List m;

    public C2847Vz(String str, List list, List list2, List list3, List list4, List list5, List list6, C4619sw c4619sw, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C2821Uz) list2.get(i)).f3851a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        a(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = c4619sw;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void a(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C2795Tz) list.get(i)).f3803a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList b(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                StreamKey streamKey = (StreamKey) list2.get(i3);
                if (streamKey.groupIndex == i && streamKey.streamIndex == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3564gu
    public final Object copy(List list) {
        return new C2847Vz(this.f3949a, this.b, b(this.e, 0, list), Collections.emptyList(), b(this.g, 1, list), b(this.h, 2, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }
}
