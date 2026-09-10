package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l8 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u2 f8368c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f8369e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f8369e = list;
        }

        @Override // com.applovin.impl.u2
        public t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return this.f8369e;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return this.f8369e.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return new x4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t2.a(t2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f8367b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.l lVar) {
        this.f8366a = str;
        this.f8367b = lVar;
        a aVar = new a(this, a(list));
        this.f8368c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f8366a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f8368c);
    }
}
