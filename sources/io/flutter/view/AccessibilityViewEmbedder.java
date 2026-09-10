package io.flutter.view;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final k reflectionAccessors = new k();
    private final SparseArray<l> flutterIdToOrigin = new SparseArray<>();
    private final Map<l, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(@NonNull View view, int i10) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i10;
    }

    private void addChildrenToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l;
        int iIntValue;
        Method method;
        for (int i10 = 0; i10 < accessibilityNodeInfo.getChildCount(); i10++) {
            k kVar = this.reflectionAccessors;
            Field field = kVar.f43508c;
            if (field == null || (method = kVar.f43509d) == null) {
                l = null;
            } else {
                try {
                    l = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i10));
                    l.getClass();
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e10) {
                    Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e10);
                    l = null;
                } catch (IllegalAccessException e11) {
                    Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e11);
                    l = null;
                }
            }
            if (l != null) {
                int iLongValue = (int) (l.longValue() >> 32);
                l lVar = new l(view, iLongValue);
                if (this.originToFlutterId.containsKey(lVar)) {
                    iIntValue = this.originToFlutterId.get(lVar).intValue();
                } else {
                    int i11 = this.nextFlutterId;
                    this.nextFlutterId = i11 + 1;
                    cacheVirtualIdMappings(view, iLongValue, i11);
                    iIntValue = i11;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(@NonNull View view, int i10, int i11) {
        l lVar = new l(view, i10);
        this.originToFlutterId.put(lVar, Integer.valueOf(i11));
        this.flutterIdToOrigin.put(i11, lVar);
    }

    @NonNull
    private AccessibilityNodeInfo convertToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, int i10, @NonNull View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
        accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
        accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
    }

    private void setFlutterNodeParent(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        this.reflectionAccessors.getClass();
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.setDataPosition(0);
        accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        long j10 = parcelObtain.readLong();
        if (k.b(0, j10)) {
            parcelObtain.readInt();
        }
        if (k.b(1, j10)) {
            parcelObtain.readLong();
        }
        if (k.b(2, j10)) {
            parcelObtain.readInt();
        }
        Long lValueOf = k.b(3, j10) ? Long.valueOf(parcelObtain.readLong()) : null;
        parcelObtain.recycle();
        if (lValueOf == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new l(view, (int) (lValueOf.longValue() >> 32)));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull Rect rect, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    @Nullable
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        l lVar = this.flutterIdToOrigin.get(i10);
        if (lVar == null) {
            return null;
        }
        View view = lVar.f43510a;
        if (!this.embeddedViewToDisplayBounds.containsKey(view) || view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(lVar.f43511b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i10, view);
    }

    @Nullable
    public Integer getRecordFlutterId(@NonNull View view, @NonNull AccessibilityRecord accessibilityRecord) {
        Long lA = k.a(this.reflectionAccessors, accessibilityRecord);
        if (lA == null) {
            return null;
        }
        return this.originToFlutterId.get(new l(view, (int) (lA.longValue() >> 32)));
    }

    public AccessibilityNodeInfo getRootNode(@NonNull View view, int i10, @NonNull Rect rect) {
        Long l;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f43506a;
        if (method == null) {
            l = null;
        } else {
            try {
                l = (Long) method.invoke(accessibilityNodeInfoCreateAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e10) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e10);
                l = null;
            } catch (InvocationTargetException e11) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e11);
                l = null;
            }
        }
        if (l == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, (int) (l.longValue() >> 32), i10);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i10, view);
    }

    public boolean onAccessibilityHoverEvent(int i10, @NonNull MotionEvent motionEvent) {
        l lVar = this.flutterIdToOrigin.get(i10);
        if (lVar == null) {
            return false;
        }
        View view = lVar.f43510a;
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i11] = pointerProperties;
            motionEvent.getPointerProperties(i11, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i11, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i11] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i10, int i11, @Nullable Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        l lVar = this.flutterIdToOrigin.get(i10);
        if (lVar == null || (accessibilityNodeProvider = lVar.f43510a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(lVar.f43511b, i11, bundle);
    }

    public View platformViewOfNode(int i10) {
        l lVar = this.flutterIdToOrigin.get(i10);
        if (lVar == null) {
            return null;
        }
        return lVar.f43510a;
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lA = k.a(this.reflectionAccessors, accessibilityEvent);
        if (lA != null) {
            int iLongValue = (int) (lA.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new l(view, iLongValue));
            if (num == null) {
                int i10 = this.nextFlutterId;
                this.nextFlutterId = i10 + 1;
                Integer numValueOf = Integer.valueOf(i10);
                cacheVirtualIdMappings(view, iLongValue, i10);
                num = numValueOf;
            }
            accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
            accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
            accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i11 = 0; i11 < accessibilityEventObtain.getRecordCount(); i11++) {
                AccessibilityRecord record = accessibilityEventObtain.getRecord(i11);
                Long lA2 = k.a(this.reflectionAccessors, record);
                if (lA2 != null) {
                    l lVar = new l(view, (int) (lA2.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(lVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(lVar).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
        }
        return false;
    }
}
