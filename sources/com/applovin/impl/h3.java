package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i3 f8059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f8060b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g3 f8061a;

        /* JADX INFO: renamed from: com.applovin.impl.h3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0007a implements d.b {
            public C0007a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f8061a);
            }
        }

        public a(g3 g3Var) {
            this.f8061a = g3Var;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() != i3.a.TEST_ADS.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
                return;
            }
            com.applovin.impl.sdk.l lVarO = this.f8061a.o();
            g3.b bVarY = this.f8061a.y();
            if (!h3.this.f8059a.a(l2Var)) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
                return;
            }
            if (g3.b.READY == bVarY) {
                d.a(h3.this, MaxDebuggerMultiAdActivity.class, lVarO.e(), new C0007a());
            } else if (g3.b.DISABLED != bVarY) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
            } else {
                lVarO.u0().a();
                q7.a(t2Var.c(), t2Var.b(), h3.this);
            }
        }
    }

    public h3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        i3 i3Var = this.f8059a;
        if (i3Var != null) {
            return i3Var.h().o();
        }
        return null;
    }

    public void initialize(g3 g3Var) {
        setTitle(g3Var.g());
        i3 i3Var = new i3(g3Var, this);
        this.f8059a = i3Var;
        i3Var.a(new a(g3Var));
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8060b = listView;
        listView.setAdapter((ListAdapter) this.f8059a);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f8059a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f8059a.k();
            this.f8059a.c();
        }
    }
}
