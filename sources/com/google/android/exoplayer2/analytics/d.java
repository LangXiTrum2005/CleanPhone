package com.google.android.exoplayer2.analytics;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements ListenerSet.Event, AccessibilityViewCommand {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f17264Y;
    public final /* synthetic */ int Z;

    public /* synthetic */ d(int i2, long j, AnalyticsListener.EventTime eventTime) {
        this.X = 0;
        this.f17264Y = eventTime;
        this.Z = i2;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean d(View view) {
        ((SideSheetBehavior) this.f17264Y).c(this.Z);
        return true;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.L((AnalyticsListener.EventTime) this.f17264Y, this.Z);
                break;
            case 1:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f17264Y;
                analyticsListener.getClass();
                analyticsListener.c(eventTime, this.Z);
                break;
            case 2:
                analyticsListener.A((AnalyticsListener.EventTime) this.f17264Y, this.Z);
                break;
            case 3:
                analyticsListener.k((AnalyticsListener.EventTime) this.f17264Y, this.Z);
                break;
            case 4:
                analyticsListener.f((AnalyticsListener.EventTime) this.f17264Y, this.Z);
                break;
            default:
                analyticsListener.q((AnalyticsListener.EventTime) this.f17264Y, this.Z);
                break;
        }
    }

    public /* synthetic */ d(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i2) {
        this.X = 2;
        this.f17264Y = eventTime;
        this.Z = i2;
    }

    public /* synthetic */ d(Object obj, int i2, int i3) {
        this.X = i3;
        this.f17264Y = obj;
        this.Z = i2;
    }
}
