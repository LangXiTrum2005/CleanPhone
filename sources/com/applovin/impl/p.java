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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f8922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u2 f8924c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f8925e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, n nVar) {
            super(context);
            this.f8925e = nVar;
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return this.f8925e.g().size();
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            ArrayList arrayList = new ArrayList();
            o oVar = (o) this.f8925e.g().get(i10);
            arrayList.add(p.this.c(oVar.c()));
            if (oVar.b() != null) {
                arrayList.add(p.this.a("AB Test Experiment Name", oVar.b()));
            }
            m8 m8VarD = oVar.d();
            p pVar = p.this;
            arrayList.add(pVar.a("Device ID Targeting", pVar.a(m8VarD.a())));
            p pVar2 = p.this;
            arrayList.add(pVar2.a("Device Type Targeting", pVar2.b(m8VarD.b())));
            if (m8VarD.c() != null) {
                arrayList.add(p.this.a(m8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            o oVar = (o) this.f8925e.g().get(i10);
            return (oVar.b() != null ? 1 : 0) + 3 + (oVar.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            if (i10 == b.TARGETED_WATERFALL.ordinal()) {
                return new x4("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            return i10 == b.OTHER_WATERFALLS.ordinal() ? new x4("OTHER WATERFALLS") : new x4("");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f8923b;
    }

    public void initialize(n nVar, com.applovin.impl.sdk.l lVar) {
        this.f8922a = nVar;
        this.f8923b = lVar;
        a aVar = new a(this, nVar);
        this.f8924c = aVar;
        aVar.a(new ac.a(this, lVar, nVar, 3));
        this.f8924c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f8922a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f8924c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f8924c;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
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
    public t2 c(String str) {
        return t2.a(t2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.l lVar, final n nVar, final l2 l2Var, t2 t2Var) {
        if (l2Var.a() == 0) {
            final int i10 = 0;
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.v9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            p.a(nVar, l2Var, lVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            p.a(nVar, l2Var, lVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        } else {
            final int i11 = 1;
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.v9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i11) {
                        case 0:
                            p.a(nVar, l2Var, lVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            p.a(nVar, l2Var, lVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, l2 l2Var, com.applovin.impl.sdk.l lVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, (o) nVar.g().get(l2Var.b()), null, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, l2 l2Var, com.applovin.impl.sdk.l lVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        o oVar = (o) nVar.g().get(l2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(oVar.c(), oVar.d().c(), lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(String str, String str2) {
        return t2.a(t2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(List list) {
        return t2.a(t2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
