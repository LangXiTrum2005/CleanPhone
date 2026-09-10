package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements monofuel {
    public static final rz a = new rz();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        sz szVar;
        if (i == 0) {
            szVar = sz.SURFACE_UNSPECIFIED;
        } else if (i == 1) {
            szVar = sz.BUBBLE_MAINPAGE;
        } else if (i == 2) {
            szVar = sz.BUBBLE_SUBPAGE;
        } else if (i == 3) {
            szVar = sz.DOWNLOADS_PAGE;
        } else if (i != 4) {
            szVar = i != 5 ? null : sz.DOWNLOAD_NOTIFICATION;
        } else {
            szVar = sz.DOWNLOAD_PROMPT;
        }
        return szVar != null;
    }
}
