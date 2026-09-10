package com.codejoy.boom.clap.data.bean;

import com.applovin.sdk.AppLovinEventTypes;
import p002kotlin.Metadata;
import pussyfooter.attabal;

/* JADX INFO: compiled from: SoundSensitivityLevel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/codejoy/boom/clap/data/bean/SoundSensitivityLevel;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "<init>", "(Ljava/lang/String;II)V", "getLevel", "()I", "VERY_HIGH", "HIGH", "AVERAGE", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum SoundSensitivityLevel {
    VERY_HIGH(0),
    HIGH(1),
    AVERAGE(2);


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f18213arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    private final int level;

    SoundSensitivityLevel(int i) {
        this.level = i;
    }

    public static attabal<SoundSensitivityLevel> getEntries() {
        return f18213arytenoidectomy;
    }

    public final int getLevel() {
        return this.level;
    }
}
