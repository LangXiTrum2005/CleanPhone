package sg.bigo.ads.common.g.c;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static long a(List<String> list) {
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "delEventInfo:" + list.size());
        StringBuilder sb = new StringBuilder("_id in (");
        int i2 = 0;
        while (i2 < list.size()) {
            sb.append(i2 == 0 ? "?" : ",?");
            i2++;
        }
        sb.append(")");
        long jB = sg.bigo.ads.common.g.a.a.b("tb_event", sb.toString(), (String[]) list.toArray(new String[0]));
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "delEventInfo count = ".concat(String.valueOf(jB)));
        return jB;
    }

    public static List<sg.bigo.ads.common.g.b.a> a(int i2) {
        Cursor cursorA = sg.bigo.ads.common.g.a.a.a("tb_event", null, null, "mtime DESC", i2);
        ArrayList arrayList = new ArrayList();
        if (cursorA == null) {
            return arrayList;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "getEventInfoList: count = " + cursorA.getCount());
        while (cursorA.moveToNext()) {
            arrayList.add(new sg.bigo.ads.common.g.b.a(cursorA));
            t.a();
        }
        cursorA.close();
        return arrayList;
    }
}
