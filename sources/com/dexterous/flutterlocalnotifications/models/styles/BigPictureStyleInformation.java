package com.dexterous.flutterlocalnotifications.models.styles;

import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class BigPictureStyleInformation extends DefaultStyleInformation {
    public Object bigPicture;
    public BitmapSource bigPictureBitmapSource;
    public String contentTitle;
    public Boolean hideExpandedLargeIcon;
    public Boolean htmlFormatContentTitle;
    public Boolean htmlFormatSummaryText;
    public Object largeIcon;
    public BitmapSource largeIconBitmapSource;
    public String summaryText;

    public BigPictureStyleInformation(Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, Boolean bool4, Object obj, BitmapSource bitmapSource, Object obj2, BitmapSource bitmapSource2, Boolean bool5) {
        super(bool, bool2);
        this.contentTitle = str;
        this.htmlFormatContentTitle = bool3;
        this.summaryText = str2;
        this.htmlFormatSummaryText = bool4;
        this.largeIcon = obj;
        this.largeIconBitmapSource = bitmapSource;
        this.bigPicture = obj2;
        this.bigPictureBitmapSource = bitmapSource2;
        this.hideExpandedLargeIcon = bool5;
    }
}
