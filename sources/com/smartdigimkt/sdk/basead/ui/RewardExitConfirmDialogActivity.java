package com.smartdigimkt.sdk.basead.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class RewardExitConfirmDialogActivity extends Activity {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f38392Y = 1;
    public static final int Z = 2;
    private static Runnable e0 = null;
    private static String f0 = null;
    private static int g0 = 1;
    private Dialog X;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
            if (RewardExitConfirmDialogActivity.e0 != null) {
                RewardExitConfirmDialogActivity.e0.run();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    private void b() {
        try {
            View viewInflate = LayoutInflater.from(this).inflate(h.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(h.a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) viewInflate.findViewById(h.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(h.a(this, "myoffer_confirm_continue", "id"));
            textView2.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_give_up", k.f38992h)));
            if (g0 != 2) {
                textView.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_msg", k.f38992h), f0));
                textView3.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_continue", k.f38992h)));
            } else {
                textView.setText(getResources().getString(h.a(this, "myoffer_anim_reward_exit_confirm_msg", k.f38992h), f0));
                textView3.setText(getResources().getString(h.a(this, "myoffer_anim_reward_exit_confirm_continue", k.f38992h)));
            }
            textView2.setOnClickListener(new a());
            textView3.setOnClickListener(new b());
            Dialog dialog = new Dialog(this, h.a(this, "style_full_screen_translucent_dialog", "style"));
            this.X = dialog;
            dialog.setContentView(viewInflate);
            this.X.setCancelable(false);
            this.X.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.X;
        if (dialog != null) {
            dialog.dismiss();
            this.X = null;
        }
        e0 = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (4 == i2) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public static void a(Context context, String str, Runnable runnable, int i2) {
        f0 = str;
        e0 = runnable;
        g0 = i2;
        Intent intent = new Intent(context, (Class<?>) RewardExitConfirmDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
