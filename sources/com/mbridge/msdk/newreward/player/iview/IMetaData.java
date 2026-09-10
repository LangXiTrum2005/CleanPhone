package com.mbridge.msdk.newreward.player.iview;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;

/* JADX INFO: loaded from: classes2.dex */
public interface IMetaData {
    @ReportAnnotation.MethodInfo(className = "IMetaData", methodName = "report", methodParameter = "1", reportType = ExifInterface.GPS_MEASUREMENT_3D)
    void activityReport(String str);

    @ReportAnnotation.MethodInfo(className = "IMetaData", methodName = "report", methodParameter = "1", reportType = ExifInterface.GPS_MEASUREMENT_3D)
    void activityReport(String str, e eVar);

    Object getDate();

    ViewGroup getRootViewGroup();

    @ReportAnnotation.MethodInfo(isParameter = true, key = "2000131", reportType = "1")
    void onShowFail(String str, int i);

    void setDate(Object obj);
}
