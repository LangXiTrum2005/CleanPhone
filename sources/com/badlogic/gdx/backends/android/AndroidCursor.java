package com.badlogic.gdx.backends.android;

import android.os.Build;
import android.view.PointerIcon;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class AndroidCursor implements Cursor {

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.AndroidCursor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor;

        static {
            int[] iArr = new int[Cursor.SystemCursor.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor = iArr;
            try {
                iArr[Cursor.SystemCursor.Arrow.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.Ibeam.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.Crosshair.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.Hand.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.HorizontalResize.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.VerticalResize.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.NWSEResize.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.NESWResize.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.AllResize.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.NotAllowed.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[Cursor.SystemCursor.None.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static void setSystemCursor(View view, Cursor.SystemCursor systemCursor) {
        int i;
        if (Build.VERSION.SDK_INT >= 24) {
            switch (AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor[systemCursor.ordinal()]) {
                case 1:
                    i = 1000;
                    break;
                case 2:
                    i = PointerIconCompat.TYPE_TEXT;
                    break;
                case 3:
                    i = PointerIconCompat.TYPE_CROSSHAIR;
                    break;
                case 4:
                    i = 1002;
                    break;
                case 5:
                    i = PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW;
                    break;
                case 6:
                    i = PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
                    break;
                case 7:
                    i = PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
                    break;
                case 8:
                    i = PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
                    break;
                case 9:
                    i = PointerIconCompat.TYPE_ALL_SCROLL;
                    break;
                case 10:
                    i = 1012;
                    break;
                case 11:
                    i = 0;
                    break;
                default:
                    throw new GdxRuntimeException("Unknown system cursor " + systemCursor);
            }
            view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i));
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
    }
}
