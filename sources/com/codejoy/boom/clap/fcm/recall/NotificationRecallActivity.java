package com.codejoy.boom.clap.fcm.recall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.codejoy.boom.clap.helper.dern;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.splash.SplashActivity;
import java.util.ListIterator;
import java.util.Stack;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import stonecrop.saneness;

/* JADX INFO: compiled from: NotificationRecallActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/codejoy/boom/clap/fcm/recall/NotificationRecallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "dovishness", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationRecallActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final int f18239gintrap = 8;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Activity activityPrevious;
        Object objM3351constructorimpl;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("extra_recall_entrance");
        dern.f18260attabal.saneness("RecallNotify", "点击召回通知：entrance=" + (stringExtra == null ? "" : stringExtra));
        saneness.f38162attabal.attabal("21b_recall_click_notify", stringExtra);
        Stack<Activity> stackAttabal = BaseActivity.INSTANCE.attabal();
        ListIterator<Activity> listIterator = stackAttabal.listIterator(stackAttabal.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                activityPrevious = null;
                break;
            }
            activityPrevious = listIterator.previous();
            Activity activity = activityPrevious;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                break;
            }
        }
        Activity activity2 = activityPrevious;
        if (activity2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intent intent = new Intent(activity2, activity2.getClass());
                intent.addFlags(537001984);
                activity2.startActivity(intent);
                objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            if (Result.m3357isSuccessimpl(objM3351constructorimpl)) {
                dern.f18260attabal.saneness("RecallNotify", "召回点击已恢复当前有效页面");
            } else {
                dern.f18260attabal.saneness("RecallNotify", "没有可恢复页面，进入 SplashActivity");
                startActivity(new Intent(this, (Class<?>) SplashActivity.class));
            }
        } else {
            dern.f18260attabal.saneness("RecallNotify", "没有可恢复页面，进入 SplashActivity");
            startActivity(new Intent(this, (Class<?>) SplashActivity.class));
        }
        finish();
    }
}
