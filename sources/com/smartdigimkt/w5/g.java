package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39421a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39422b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39423c = 2;
    public static final int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39424e = 8;
    public static final int f = 16;
    public static final int g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39425h = 64;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f39426a = "screen_style";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f39427b = "shake_view_extra_container";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f39428c = "native_ad_event_listener";
        public static final String d = "video_length";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f39429e = "material_direction";
        public static final String f = "click_type";
        public static final String g = "click_area";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f39430h = "cta_text";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f39431i = "video_play_fail_message";
        public static final String j = "video_reset_player_view_type";
        public static final String k = "video_progress";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    public static List<c> a(int i2, Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, int i3, c.a aVar2) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_guide2click_container", "id"));
        View viewFindViewById = viewGroup.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_guide2click_mask", "id"));
        View viewFindViewById2 = viewGroup.findViewById(com.smartdigimkt.n8.h.a(viewGroup.getContext(), "myoffer_rl_root", "id"));
        if (viewFindViewById2 == null || !(viewFindViewById2 instanceof ViewGroup)) {
            View viewFindViewById3 = viewGroup.findViewById(com.smartdigimkt.n8.h.a(viewGroup.getContext(), "myoffer_splash_root", "id"));
            if (viewFindViewById3 == null || !(viewFindViewById3 instanceof ViewGroup)) {
                viewGroup2 = viewGroup;
            } else {
                viewGroup3 = (ViewGroup) viewFindViewById3;
            }
            if ((i2 & 16) == 16) {
                d dVar = new d();
                dVar.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(dVar);
            }
            if ((i2 & 1) == 1) {
                j jVar = new j();
                jVar.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(jVar);
            }
            if ((i2 & 2) == 2) {
                e eVar = new e();
                eVar.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(eVar);
            }
            if ((i2 & 4) == 4) {
                k kVar = new k();
                kVar.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(kVar);
            }
            if (relativeLayout != null && (i2 & 8) == 8) {
                f fVar2 = new f();
                fVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(fVar2);
            }
            if (relativeLayout != null && (i2 & 32) == 32) {
                h hVar = new h();
                hVar.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(hVar);
            }
            if ((i2 & 64) == 64) {
                b bVar = new b();
                bVar.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
                arrayList.add(bVar);
            }
            return arrayList;
        }
        viewGroup3 = (ViewGroup) viewFindViewById2;
        viewGroup2 = viewGroup3;
        if ((i2 & 16) == 16) {
            d dVar2 = new d();
            dVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(dVar2);
        }
        if ((i2 & 1) == 1) {
            j jVar2 = new j();
            jVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(jVar2);
        }
        if ((i2 & 2) == 2) {
            e eVar2 = new e();
            eVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(eVar2);
        }
        if ((i2 & 4) == 4) {
            k kVar2 = new k();
            kVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(kVar2);
        }
        if (relativeLayout != null) {
            f fVar3 = new f();
            fVar3.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(fVar3);
        }
        if (relativeLayout != null) {
            h hVar2 = new h();
            hVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(hVar2);
        }
        if ((i2 & 64) == 64) {
            b bVar2 = new b();
            bVar2.a(viewGroup2.getContext(), fVar, aVar, viewGroup2, relativeLayout, viewFindViewById, i3, aVar2);
            arrayList.add(bVar2);
        }
        return arrayList;
    }
}
