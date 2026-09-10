package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0954p extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0950n f11429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f11431c;

    /* JADX INFO: renamed from: com.applovin.impl.p$a */
    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0950n f11432e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C0950n c0950n) {
            super(context);
            this.f11432e = c0950n;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return this.f11432e.g().size();
        }

        @Override // com.applovin.impl.s2
        public List c(int i2) {
            ArrayList arrayList = new ArrayList();
            C0952o c0952o = (C0952o) this.f11432e.g().get(i2);
            arrayList.add(AbstractActivityC0954p.this.c(c0952o.c()));
            if (c0952o.b() != null) {
                arrayList.add(AbstractActivityC0954p.this.a("AB Test Experiment Name", c0952o.b()));
            }
            k8 k8VarD = c0952o.d();
            AbstractActivityC0954p abstractActivityC0954p = AbstractActivityC0954p.this;
            arrayList.add(abstractActivityC0954p.a("Device ID Targeting", abstractActivityC0954p.a(k8VarD.a())));
            AbstractActivityC0954p abstractActivityC0954p2 = AbstractActivityC0954p.this;
            arrayList.add(abstractActivityC0954p2.a("Device Type Targeting", abstractActivityC0954p2.b(k8VarD.b())));
            if (k8VarD.c() != null) {
                arrayList.add(AbstractActivityC0954p.this.a(k8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i2) {
            C0952o c0952o = (C0952o) this.f11432e.g().get(i2);
            return (c0952o.b() != null ? 1 : 0) + 3 + (c0952o.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i2) {
            if (i2 == b.TARGETED_WATERFALL.ordinal()) {
                return new v4("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            return i2 == b.OTHER_WATERFALLS.ordinal() ? new v4("OTHER WATERFALLS") : new v4("");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p$b */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f11430b;
    }

    public void initialize(C0950n c0950n, com.applovin.impl.sdk.k kVar) {
        this.f11429a = c0950n;
        this.f11430b = kVar;
        a aVar = new a(this, c0950n);
        this.f11431c = aVar;
        aVar.a(new androidx.media3.exoplayer.analytics.o(this, kVar, c0950n, 2));
        this.f11431c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f11429a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f11431c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f11431c;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 c(String str) {
        return r2.a(r2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final C0950n c0950n, final j2 j2Var, r2 r2Var) {
        if (j2Var.a() == 0) {
            final int i2 = 0;
            AbstractC0930d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new AbstractC0930d.b() { // from class: com.applovin.impl.C0
                @Override // com.applovin.impl.AbstractC0930d.b
                public final void a(Activity activity) {
                    switch (i2) {
                        case 0:
                            j2 j2Var2 = j2Var;
                            AbstractActivityC0954p.a(c0950n, j2Var2, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            j2 j2Var3 = j2Var;
                            AbstractActivityC0954p.a(c0950n, j2Var3, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        } else {
            final int i3 = 1;
            AbstractC0930d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, kVar.e(), new AbstractC0930d.b() { // from class: com.applovin.impl.C0
                @Override // com.applovin.impl.AbstractC0930d.b
                public final void a(Activity activity) {
                    switch (i3) {
                        case 0:
                            j2 j2Var2 = j2Var;
                            AbstractActivityC0954p.a(c0950n, j2Var2, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            j2 j2Var3 = j2Var;
                            AbstractActivityC0954p.a(c0950n, j2Var3, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C0950n c0950n, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c0950n, (C0952o) c0950n.g().get(j2Var.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C0950n c0950n, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C0952o c0952o = (C0952o) c0950n.g().get(j2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c0952o.c(), c0952o.d().c(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(String str, String str2) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(List list) {
        return r2.a(r2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals(com.smartdigimkt.b0.a.n1)) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
