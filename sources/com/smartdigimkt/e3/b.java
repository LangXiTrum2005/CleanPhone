package com.smartdigimkt.e3;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements com.smartdigimkt.e3.a {
    private volatile boolean closeCallbacked = false;
    private final String showId;

    public class a implements com.smartdigimkt.i7.a.InterfaceC0508a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f34608a;

        public a(Map map) {
            this.f34608a = map;
        }

        @Override // com.smartdigimkt.i7.a.InterfaceC0508a
        public void a(String str) {
            if (!b.this.showId.equals(str) || b.this.closeCallbacked) {
                return;
            }
            Map map = this.f34608a;
            if (map != null) {
                map.put("close_scene", 3);
            }
            b.this.onAdClose(false, "", 0.0f);
        }
    }

    public b(Map<String, Object> map, String str) {
        this.showId = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map != null) {
            map.put("close_scene", 4);
        }
        com.smartdigimkt.i7.a.a().a(str, new a(map));
    }

    @Override // com.smartdigimkt.e3.a
    public void onAdClose(boolean z2, String str, float f) {
        if (this.closeCallbacked) {
            return;
        }
        this.closeCallbacked = true;
    }
}
