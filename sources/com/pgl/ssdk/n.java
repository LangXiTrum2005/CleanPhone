package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class n {
    public static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        List<String> listB = b(new ArrayList(new TreeSet(list)));
        List<String> listSubList = listB.subList(0, Math.min(listB.size(), 100));
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = listSubList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) com.smartdigimkt.b0.a.U1);
            }
        }
        return sb.toString();
    }

    private static List<String> b(List<String> list) {
        if (list != null && !list.isEmpty()) {
            String[] strArr = {"abc_", "$avd_hide_", "avd_hide_", "$avd_show_", "avd_show_", "m3_avd_", "$m3_avd_", "ic_mtrl_", "$mtrl_", "mtrl_", "btn_checkbox_", "bd_progress_", "bd_bg_", "btn_radio_", "pangle_", "anythink_", "mbridge_", "sig_", "klevin", "$applovin_", "applovin_", "ad_mob_", "admob_", "common_google_", "bigo_", "mobads_", "tapad_", "vivo_module_", "com_facebook_", "tt_", "audience_network.dex", "-journal"};
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                for (int i2 = 0; i2 < 32; i2++) {
                    String str = strArr[i2];
                    if (!TextUtils.isEmpty(str) && (next.startsWith(str) || next.endsWith(str))) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        return list;
    }
}
