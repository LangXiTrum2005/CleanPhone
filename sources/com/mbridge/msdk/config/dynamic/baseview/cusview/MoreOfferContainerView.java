package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.applovin.impl.ca;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MoreOfferContainerView extends ComponentHorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f32582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.config.dynamic.binddata.wrapper.a f32583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<Map<String, Object>> f32584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewGroup f32585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnTouchListener f32586f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f32587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.dynamic.binddata.wrapper.a f32588b;

        public a(List list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
            this.f32587a = list;
            this.f32588b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MoreOfferContainerView.this.updateMoreOfferData(this.f32587a, this.f32588b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MoreOfferContainerView.this.a();
            return false;
        }
    }

    public MoreOfferContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32581a = "MoreOfferContainerView";
        this.f32582b = "";
        this.f32586f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getVisibleViews, reason: merged with bridge method [inline-methods] */
    public void a() {
        XMLView xMLView;
        ViewGroup viewGroup = this.f32585e;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < this.f32585e.getChildCount(); i10++) {
            View childAt = this.f32585e.getChildAt(i10);
            Rect rect = new Rect();
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
            boolean z10 = rect.width() > childAt.getMeasuredWidth() / 5;
            if (globalVisibleRect && z10 && (xMLView = this.xmlView) != null && xMLView.getXmlViewActionListener() != null) {
                HashMap map = new HashMap();
                map.put("view_tag", childAt.getTag());
                HashMap map2 = new HashMap();
                map2.put("index", String.valueOf(childAt.getId()));
                map.put("property", map2);
                this.xmlView.getXmlViewActionListener().a(map);
            }
        }
    }

    public void setData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f32583c = aVar;
        this.f32584d = list;
        postDelayed(new a(list, aVar), 1000L);
    }

    public void setItemXMLPath(String str) {
        this.f32582b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b bVarF;
        if (map == null) {
            return;
        }
        try {
            if (String.valueOf(map.get("clickable")).equals(com.ironsource.mediationsdk.metadata.a.f29610g)) {
                setViewClickListener();
            }
            Object obj = map.get("parentPath");
            String strSubstring = "";
            if (obj instanceof String) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && (bVarF = com.mbridge.msdk.config.component.common.file.a.f(strValueOf)) != null && !TextUtils.isEmpty(bVarF.c())) {
                    strSubstring = bVarF.c();
                }
            }
            String strValueOf2 = String.valueOf(map.get("parentLayoutFilePath"));
            if (!TextUtils.isEmpty(strValueOf2) && !strValueOf2.equalsIgnoreCase("null")) {
                strSubstring = strValueOf2.substring(0, strValueOf2.lastIndexOf("/") + 1);
            }
            Object obj2 = map.get("itemXml");
            if (obj2 instanceof String) {
                setItemXMLPath(strSubstring.concat(obj2.toString()).concat(".xml"));
            }
            Object obj3 = map.get("globalModel");
            if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.f32583c = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3;
            }
            Object obj4 = map.get("data");
            if (obj4 instanceof List) {
                setData((List) obj4, this.f32583c);
            }
        } catch (Throwable th2) {
            q0.b("MoreOfferContainerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof List) {
                setData((List) obj, this.f32583c);
            }
        } catch (Throwable th2) {
            q0.b("MoreOfferContainerView", th2.getMessage());
        }
    }

    public void updateMoreOfferData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.f32585e = linearLayout;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map<String, Object> map = list.get(i10);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
            aVar2.a((Map<? extends String, ?>) map);
            aVar.a("listData", aVar2);
            View viewA = new com.mbridge.msdk.config.dynamic.a().a(this.f32582b, null, aVar);
            if (viewA != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 20, 0);
                viewA.setLayoutParams(layoutParams);
                viewA.setId(i10);
                viewA.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 1));
                linearLayout.addView(viewA);
            }
        }
        if (linearLayout.getChildCount() > 0) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            addView(linearLayout);
            setOnTouchListener(this.f32586f);
            linearLayout.postDelayed(new f(this, 3), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        String string = view.getTag().toString();
        int id2 = view.getId();
        a(String.valueOf(id2), string, this.f32584d.get(id2));
    }

    public void a(String str, String str2, Map<String, Object> map) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(this);
        }
        HashMap mapN = ca.n("viewTag", str2);
        HashMap mapN2 = ca.n("index", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        mapN2.put("selectedContents", arrayList);
        mapN.put("property", mapN2);
        com.mbridge.msdk.config.dynamic.utils.f.a(this.xmlView, str2, mapN);
    }
}
