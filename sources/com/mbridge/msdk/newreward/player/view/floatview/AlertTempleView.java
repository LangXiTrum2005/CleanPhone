package com.mbridge.msdk.newreward.player.view.floatview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.newreward.player.presenter.AbsPresenter;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AlertTempleView extends FrameLayout {
    public static final int TYPE_IV = 0;
    public static final int TYPE_PL = 2;
    public static final int TYPE_RV = 1;
    private final String TAG;
    private final View.OnClickListener buttonClickListener;
    String closeBtnText;
    Button closeButton;
    String content;
    TextView contentView;
    String continueBtnText;
    Button continueButton;
    public AbsPresenter mPresenter;
    String title;
    TextView titleView;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AlertType {
    }

    public AlertTempleView(@NonNull Context context, AbsPresenter absPresenter) {
        super(context);
        this.TAG = "AlertTempleView";
        this.title = "";
        this.content = "";
        this.closeBtnText = "";
        this.continueBtnText = "";
        this.buttonClickListener = new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.floatview.AlertTempleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbsPresenter absPresenter2 = AlertTempleView.this.mPresenter;
                if (absPresenter2 != null) {
                    absPresenter2.click(view);
                }
            }
        };
        this.mPresenter = absPresenter;
        initView();
    }

    private void initView() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(-1073741824);
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.floatview.AlertTempleView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        View viewInflate = LayoutInflater.from(getContext()).inflate(g0.a(getContext(), "mbridge_alertview_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) this, true);
        if (viewInflate != null) {
            this.titleView = (TextView) viewInflate.findViewById(g0.a(getContext(), "mbridge_alertview_titleview", "id"));
            this.contentView = (TextView) viewInflate.findViewById(g0.a(getContext(), "mbridge_alertview_contentview", "id"));
            this.closeButton = (Button) viewInflate.findViewById(g0.a(getContext(), "mbridge_alertview_close_button", "id"));
            this.continueButton = (Button) viewInflate.findViewById(g0.a(getContext(), "mbridge_alertview_continue_button", "id"));
            this.closeButton.setOnClickListener(this.buttonClickListener);
            this.continueButton.setOnClickListener(this.buttonClickListener);
        }
    }

    private void setIVAlertViewContent(int i, String str) {
        try {
            this.title = w0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            this.content = w0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            this.continueBtnText = w0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            this.closeBtnText = w0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
        } catch (Exception e) {
            o0.a("AlertTempleView", e.getMessage());
        }
        if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.content) && TextUtils.isEmpty(this.closeBtnText) && TextUtils.isEmpty(this.continueBtnText)) {
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                int i2 = a.H;
                this.title = i == i2 ? "Confirm" : "Tips";
                this.content = i == i2 ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?";
                this.continueBtnText = "Continue";
                this.closeBtnText = i == i2 ? "Close" : "Cancel";
            } else {
                int i3 = a.H;
                this.title = i == i3 ? "确认关闭？" : "提示";
                this.content = i == i3 ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？";
                this.continueBtnText = "继续";
                this.closeBtnText = i == i3 ? "确认关闭" : "取消";
            }
        }
        setViewContent(this.title, this.content, this.closeBtnText, this.continueBtnText);
    }

    private void setPlayableAlertViewContent() {
        g gVarF = AbstractC3888ke0.f(h.b());
        this.title = gVarF.s();
        this.content = gVarF.q();
        this.continueBtnText = gVarF.o();
        this.closeBtnText = gVarF.r();
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.content) && TextUtils.isEmpty(this.closeBtnText) && TextUtils.isEmpty(this.continueBtnText)) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.title = "Confirm to close? ";
                this.content = "You will not be rewarded after closing the window";
                this.closeBtnText = "Close it";
                this.continueBtnText = "Continue";
            } else {
                this.title = "确认关闭？";
                this.content = "关闭后您将不会获得任何奖励噢~ ";
                this.closeBtnText = "确认关闭";
                this.continueBtnText = "继续试玩";
            }
        }
        setViewContent(this.title, this.content, this.closeBtnText, this.continueBtnText);
    }

    private void setRVAlertViewContent(String str) {
        try {
            this.title = w0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            this.content = w0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            this.continueBtnText = w0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            this.closeBtnText = w0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g gVarD = h.b().d(c.n().b());
            if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.content) && TextUtils.isEmpty(this.closeBtnText) && TextUtils.isEmpty(this.continueBtnText) && gVarD != null) {
                this.title = gVarD.s();
                this.content = gVarD.q();
                this.closeBtnText = gVarD.r();
                this.continueBtnText = gVarD.p();
            }
            if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.content) && TextUtils.isEmpty(this.closeBtnText) && TextUtils.isEmpty(this.continueBtnText)) {
                String language = Locale.getDefault().getLanguage();
                if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    this.title = "Confirm to close? ";
                    this.content = "You will not be rewarded after closing the window";
                    this.continueBtnText = "Continue";
                    this.closeBtnText = "Close it";
                } else {
                    this.title = "确认关闭？";
                    this.content = "关闭后您将不会获得任何奖励噢~ ";
                    this.continueBtnText = "继续观看";
                    this.closeBtnText = "确认关闭";
                }
            }
            setViewContent(this.title, this.content, this.closeBtnText, this.continueBtnText);
        } catch (Exception e) {
            o0.a("AlertTempleView", e.getMessage());
        }
    }

    private void setViewContent(String str, String str2, String str3, String str4) {
        this.titleView.setText(str);
        this.contentView.setText(str2);
        this.closeButton.setText(str3);
        this.continueButton.setText(str4);
    }

    public void setAlertType(int i, String str, int i2) {
        if (i == 0) {
            setIVAlertViewContent(i2, str);
        } else if (i == 1) {
            setRVAlertViewContent(str);
        } else if (i == 2) {
            setPlayableAlertViewContent();
        }
    }

    public void setPresenter(AbsPresenter absPresenter) {
        this.mPresenter = absPresenter;
    }

    public AlertTempleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "AlertTempleView";
        this.title = "";
        this.content = "";
        this.closeBtnText = "";
        this.continueBtnText = "";
        this.buttonClickListener = new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.floatview.AlertTempleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbsPresenter absPresenter2 = AlertTempleView.this.mPresenter;
                if (absPresenter2 != null) {
                    absPresenter2.click(view);
                }
            }
        };
        initView();
    }
}
