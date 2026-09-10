package com.smartdigimkt.z2;

import android.content.res.Configuration;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class d implements com.smartdigimkt.x2.e, com.smartdigimkt.x2.h {
    protected static final String X = "DefaultJSContainerModule";

    @Override // com.smartdigimkt.x2.e
    public void configurationChanged(int i2, int i3, int i4) {
    }

    @Override // com.smartdigimkt.x2.e
    public boolean endCardShowing() {
        return true;
    }

    @Override // com.smartdigimkt.x2.e, com.smartdigimkt.x2.h
    public void handlerPlayableException(String str) {
    }

    @Override // com.smartdigimkt.x2.e
    public void hideAlertWebview() {
    }

    @Override // com.smartdigimkt.x2.h
    public void install(com.smartdigimkt.x.d dVar) {
        Objects.toString(dVar);
    }

    @Override // com.smartdigimkt.x2.e
    public void ivRewardAdsWithoutVideo(String str) {
    }

    @Override // com.smartdigimkt.x2.e
    public boolean miniCardLoaded() {
        return false;
    }

    @Override // com.smartdigimkt.x2.e
    public boolean miniCardShowing() {
        return false;
    }

    @Override // com.smartdigimkt.x2.h
    public void notifyCloseBtn(int i2) {
    }

    @Override // com.smartdigimkt.x2.h
    public void orientation(Configuration configuration) {
        Objects.toString(configuration);
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
    }

    @Override // com.smartdigimkt.x2.e, com.smartdigimkt.x2.h
    public void readyStatus(int i2) {
    }

    @Override // com.smartdigimkt.x2.e
    public void resizeMiniCard(int i2, int i3, int i4) {
    }

    @Override // com.smartdigimkt.x2.e
    public boolean showAlertWebView() {
        return false;
    }

    @Override // com.smartdigimkt.x2.e
    public void showEndcard(int i2) {
    }

    @Override // com.smartdigimkt.x2.e
    public void showMiniCard(int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // com.smartdigimkt.x2.e
    public void showPlayableView() {
    }

    @Override // com.smartdigimkt.x2.e
    public void showVideoClickView(int i2) {
    }

    @Override // com.smartdigimkt.x2.e
    public void showVideoEndCover() {
    }

    @Override // com.smartdigimkt.x2.h
    public void toggleCloseBtn(int i2) {
    }

    @Override // com.smartdigimkt.x2.h
    public void webviewshow() {
    }
}
