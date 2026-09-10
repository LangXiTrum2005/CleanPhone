package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.ironsource.Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import outmarry.rotuma;

/* JADX INFO: compiled from: TimePickerClockPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront implements ClockHandView.dern, TimePickerView.beachfront, TimePickerView.marial, ClockHandView.saneness, competently {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final TimeModel f21363arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TimePickerView f21364kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f21365molybdenite = false;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f21366monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f21367polloi;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final String[] f21362graveside = {"12", "1", "2", "3", "4", CampaignEx.CLICKMODE_ON, "6", Bc.e, "8", "9", "10", "11"};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final String[] f21360adultoid = {"00", "1", "2", "3", "4", CampaignEx.CLICKMODE_ON, "6", Bc.e, "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final String[] f21361dovishness = {"00", CampaignEx.CLICKMODE_ON, "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    public class attabal extends com.google.android.material.timepicker.attabal {
        public attabal(Context context, int i) {
            super(context, i);
        }

        @Override // com.google.android.material.timepicker.attabal, androidx.core.view.attabal
        public void competently(View view, rotuma rotumaVar) {
            super.competently(view, rotumaVar);
            rotumaVar.picketboat(view.getResources().getString(beachfront.this.f21363arytenoidectomy.dern(), String.valueOf(beachfront.this.f21363arytenoidectomy.wireman())));
        }
    }

    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    public class saneness extends com.google.android.material.timepicker.attabal {
        public saneness(Context context, int i) {
            super(context, i);
        }

        @Override // com.google.android.material.timepicker.attabal, androidx.core.view.attabal
        public void competently(View view, rotuma rotumaVar) {
            super.competently(view, rotumaVar);
            rotumaVar.picketboat(view.getResources().getString(bubbles.apical.material_minute_suffix, String.valueOf(beachfront.this.f21363arytenoidectomy.f21342molybdenite)));
        }
    }

    public beachfront(TimePickerView timePickerView, TimeModel timeModel) {
        this.f21364kowloon = timePickerView;
        this.f21363arytenoidectomy = timeModel;
        taiyuan();
    }

    public void apical(int i, boolean z) {
        boolean z2 = i == 12;
        this.f21364kowloon.trm(z2);
        this.f21363arytenoidectomy.f21340graveside = i;
        this.f21364kowloon.grimness(z2 ? f21361dovishness : competently(), z2 ? bubbles.apical.material_minute_suffix : this.f21363arytenoidectomy.dern());
        formularize();
        this.f21364kowloon.yemenite(z2 ? this.f21366monoploid : this.f21367polloi, z);
        this.f21364kowloon.stratoscope(i);
        this.f21364kowloon.kattegat(new attabal(this.f21364kowloon.getContext(), bubbles.apical.material_hour_selection));
        this.f21364kowloon.sealless(new saneness(this.f21364kowloon.getContext(), bubbles.apical.material_minute_selection));
    }

    @Override // com.google.android.material.timepicker.ClockHandView.saneness
    public void attabal(float f, boolean z) {
        this.f21365molybdenite = true;
        TimeModel timeModel = this.f21363arytenoidectomy;
        int i = timeModel.f21342molybdenite;
        int i2 = timeModel.f21344polloi;
        if (timeModel.f21340graveside == 10) {
            this.f21364kowloon.yemenite(this.f21367polloi, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) picketboat.saneness.getSystemService(this.f21364kowloon.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                apical(12, true);
            }
        } else {
            int iRound = Math.round(f);
            if (!z) {
                this.f21363arytenoidectomy.cutely(((iRound + 15) / 30) * 5);
                this.f21366monoploid = this.f21363arytenoidectomy.f21342molybdenite * 6;
            }
            this.f21364kowloon.yemenite(this.f21366monoploid, z);
        }
        this.f21365molybdenite = false;
        impassible();
        cutely(i2, i);
    }

    public final String[] competently() {
        return this.f21363arytenoidectomy.f21343monoploid == 1 ? f21360adultoid : f21362graveside;
    }

    public final void cutely(int i, int i2) {
        TimeModel timeModel = this.f21363arytenoidectomy;
        if (timeModel.f21342molybdenite == i2 && timeModel.f21344polloi == i) {
            return;
        }
        this.f21364kowloon.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.beachfront
    public void dern(int i) {
        apical(i, true);
    }

    public final void formularize() {
        TimeModel timeModel = this.f21363arytenoidectomy;
        int i = 1;
        if (timeModel.f21340graveside == 10 && timeModel.f21343monoploid == 1 && timeModel.f21344polloi >= 12) {
            i = 2;
        }
        this.f21364kowloon.oilcan(i);
    }

    public final void impassible() {
        TimePickerView timePickerView = this.f21364kowloon;
        TimeModel timeModel = this.f21363arytenoidectomy;
        timePickerView.starveling(timeModel.f21338adultoid, timeModel.wireman(), this.f21363arytenoidectomy.f21342molybdenite);
    }

    public final int impromptu() {
        return (this.f21363arytenoidectomy.wireman() * 30) % 360;
    }

    @Override // com.google.android.material.timepicker.competently
    public void invalidate() {
        this.f21367polloi = impromptu();
        TimeModel timeModel = this.f21363arytenoidectomy;
        this.f21366monoploid = timeModel.f21342molybdenite * 6;
        apical(timeModel.f21340graveside, false);
        impassible();
    }

    public final void kowloon(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.saneness(this.f21364kowloon.getResources(), strArr[i], str);
        }
    }

    @Override // com.google.android.material.timepicker.competently
    public void marial() {
        this.f21364kowloon.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.marial
    public void saneness(int i) {
        this.f21363arytenoidectomy.apical(i);
    }

    @Override // com.google.android.material.timepicker.competently
    public void show() {
        this.f21364kowloon.setVisibility(0);
    }

    public void taiyuan() {
        if (this.f21363arytenoidectomy.f21343monoploid == 0) {
            this.f21364kowloon.privatdozent();
        }
        this.f21364kowloon.cord(this);
        this.f21364kowloon.polder(this);
        this.f21364kowloon.merc(this);
        this.f21364kowloon.supplicat(this);
        triweekly();
        invalidate();
    }

    public final void triweekly() {
        kowloon(f21362graveside, "%d");
        kowloon(f21360adultoid, "%d");
        kowloon(f21361dovishness, "%02d");
    }

    @Override // com.google.android.material.timepicker.ClockHandView.dern
    public void wireman(float f, boolean z) {
        if (this.f21365molybdenite || z) {
            return;
        }
        TimeModel timeModel = this.f21363arytenoidectomy;
        int i = timeModel.f21344polloi;
        int i2 = timeModel.f21342molybdenite;
        int iRound = Math.round(f);
        TimeModel timeModel2 = this.f21363arytenoidectomy;
        if (timeModel2.f21340graveside == 12) {
            timeModel2.cutely((iRound + 3) / 6);
            this.f21366monoploid = (float) Math.floor(this.f21363arytenoidectomy.f21342molybdenite * 6);
        } else {
            int i3 = (iRound + 15) / 30;
            if (timeModel2.f21343monoploid == 1) {
                i3 %= 12;
                if (this.f21364kowloon.cuirassed() == 2) {
                    i3 += 12;
                }
            }
            this.f21363arytenoidectomy.taiyuan(i3);
            this.f21367polloi = impromptu();
        }
        impassible();
        cutely(i, i2);
    }
}
