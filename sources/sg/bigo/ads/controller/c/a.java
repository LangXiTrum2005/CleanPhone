package sg.bigo.ads.controller.c;

import android.database.Cursor;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static sg.bigo.ads.api.core.c a(sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.core.h hVar) {
        String[] strArr = {"slot"};
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 <= 0; i2++) {
            sb.append(strArr[0]);
            sb.append("=? ");
        }
        Cursor cursorA = sg.bigo.ads.common.g.a.a.a("tb_addata", sb.toString(), new String[]{String.valueOf(lVar.l())}, null, 1);
        if (cursorA != null) {
            if (cursorA.moveToNext()) {
                long j = cursorA.getLong(cursorA.getColumnIndex("log_id"));
                String string = cursorA.getString(cursorA.getColumnIndex("ad_data"));
                long j2 = cursorA.getLong(cursorA.getColumnIndex("end_time"));
                b bVarA = b.a(j, hVar, lVar, string);
                if (bVarA != null) {
                    bVarA.ag();
                    bVarA.a(j2);
                    return bVarA;
                }
            }
            cursorA.close();
        }
        return null;
    }

    public static boolean a(String str) {
        int iB = sg.bigo.ads.common.g.a.a.b("tb_addata", "slot = '" + str + "'", null);
        t.a();
        return iB > 0;
    }
}
