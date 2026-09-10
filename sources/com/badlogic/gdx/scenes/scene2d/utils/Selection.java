package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.OrderedSet;
import com.badlogic.gdx.utils.Pools;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Selection<T> implements Disableable, Iterable<T> {

    @Null
    private Actor actor;
    boolean isDisabled;

    @Null
    T lastSelected;
    boolean multiple;
    boolean required;
    private boolean toggle;
    final OrderedSet<T> selected = new OrderedSet<>();
    private final OrderedSet<T> old = new OrderedSet<>();
    private boolean programmaticChangeEvents = true;

    public void add(T t) {
        if (t == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.selected.add(t)) {
            if (this.programmaticChangeEvents && fireChangeEvent()) {
                this.selected.remove(t);
            } else {
                this.lastSelected = t;
                changed();
            }
        }
    }

    public void addAll(Array<T> array) {
        snapshot();
        int i = array.size;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            T t = array.get(i2);
            if (t == null) {
                throw new IllegalArgumentException("item cannot be null.");
            }
            if (this.selected.add(t)) {
                z = true;
            }
        }
        if (z) {
            if (this.programmaticChangeEvents && fireChangeEvent()) {
                revert();
            } else {
                this.lastSelected = array.peek();
                changed();
            }
        }
        cleanup();
    }

    public void changed() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x000a, B:9:0x000f, B:23:0x0038, B:25:0x003d, B:27:0x0041, B:40:0x0065, B:45:0x0073, B:46:0x0075, B:48:0x007b, B:49:0x007f, B:29:0x0047, B:31:0x004d, B:35:0x0057, B:39:0x005f, B:14:0x0019, B:16:0x0021, B:18:0x0025, B:22:0x002f), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0047 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x000a, B:9:0x000f, B:23:0x0038, B:25:0x003d, B:27:0x0041, B:40:0x0065, B:45:0x0073, B:46:0x0075, B:48:0x007b, B:49:0x007f, B:29:0x0047, B:31:0x004d, B:35:0x0057, B:39:0x005f, B:14:0x0019, B:16:0x0021, B:18:0x0025, B:22:0x002f), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x004d A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x000a, B:9:0x000f, B:23:0x0038, B:25:0x003d, B:27:0x0041, B:40:0x0065, B:45:0x0073, B:46:0x0075, B:48:0x007b, B:49:0x007f, B:29:0x0047, B:31:0x004d, B:35:0x0057, B:39:0x005f, B:14:0x0019, B:16:0x0021, B:18:0x0025, B:22:0x002f), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    public void choose(T t) {
        boolean z;
        OrderedSet<T> orderedSet;
        OrderedSet<T> orderedSet2;
        if (t == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.isDisabled) {
            return;
        }
        snapshot();
        try {
            boolean z2 = true;
            if (!this.toggle && !UIUtils.ctrl()) {
                z = false;
                if (this.multiple) {
                    orderedSet = this.selected;
                    if (orderedSet.size != 1) {
                    }
                    orderedSet2 = this.selected;
                    if (orderedSet2.size <= 0) {
                        z2 = false;
                    }
                    orderedSet2.clear(8);
                    z = z2;
                } else {
                    orderedSet = this.selected;
                    if (orderedSet.size != 1) {
                    }
                    orderedSet2 = this.selected;
                    if (orderedSet2.size <= 0) {
                        z2 = false;
                    }
                    orderedSet2.clear(8);
                    z = z2;
                }
                if (this.selected.add(t)) {
                }
                this.lastSelected = t;
            } else if (!this.selected.contains(t)) {
                z = false;
                if (this.multiple || (!this.toggle && !UIUtils.ctrl())) {
                    orderedSet = this.selected;
                    if (orderedSet.size != 1 && orderedSet.contains(t)) {
                        return;
                    }
                    orderedSet2 = this.selected;
                    if (orderedSet2.size <= 0) {
                        z2 = false;
                    }
                    orderedSet2.clear(8);
                    z = z2;
                }
                if (this.selected.add(t) && !z) {
                    return;
                } else {
                    this.lastSelected = t;
                }
            } else {
                if (this.required && this.selected.size == 1) {
                    return;
                }
                this.selected.remove(t);
                this.lastSelected = null;
            }
            if (fireChangeEvent()) {
                revert();
            } else {
                changed();
            }
        } finally {
            cleanup();
        }
    }

    public void cleanup() {
        this.old.clear(32);
    }

    public void clear() {
        if (this.selected.size == 0) {
            this.lastSelected = null;
            return;
        }
        snapshot();
        this.selected.clear(8);
        if (this.programmaticChangeEvents && fireChangeEvent()) {
            revert();
        } else {
            this.lastSelected = null;
            changed();
        }
        cleanup();
    }

    public boolean contains(@Null T t) {
        if (t == null) {
            return false;
        }
        return this.selected.contains(t);
    }

    public boolean fireChangeEvent() {
        if (this.actor == null) {
            return false;
        }
        ChangeListener.ChangeEvent changeEvent = (ChangeListener.ChangeEvent) Pools.obtain(ChangeListener.ChangeEvent.class);
        try {
            return this.actor.fire(changeEvent);
        } finally {
            Pools.free(changeEvent);
        }
    }

    @Null
    public T first() {
        OrderedSet<T> orderedSet = this.selected;
        if (orderedSet.size == 0) {
            return null;
        }
        return orderedSet.first();
    }

    @Null
    public T getLastSelected() {
        T t = this.lastSelected;
        if (t != null) {
            return t;
        }
        OrderedSet<T> orderedSet = this.selected;
        if (orderedSet.size > 0) {
            return orderedSet.first();
        }
        return null;
    }

    public boolean getMultiple() {
        return this.multiple;
    }

    public boolean getRequired() {
        return this.required;
    }

    public boolean getToggle() {
        return this.toggle;
    }

    @Deprecated
    public boolean hasItems() {
        return this.selected.size > 0;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public boolean isDisabled() {
        return this.isDisabled;
    }

    public boolean isEmpty() {
        return this.selected.size == 0;
    }

    public OrderedSet<T> items() {
        return this.selected;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.selected.iterator();
    }

    public boolean notEmpty() {
        return this.selected.size > 0;
    }

    public void remove(T t) {
        if (t == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.selected.remove(t)) {
            if (this.programmaticChangeEvents && fireChangeEvent()) {
                this.selected.add(t);
            } else {
                this.lastSelected = null;
                changed();
            }
        }
    }

    public void removeAll(Array<T> array) {
        snapshot();
        int i = array.size;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            T t = array.get(i2);
            if (t == null) {
                throw new IllegalArgumentException("item cannot be null.");
            }
            if (this.selected.remove(t)) {
                z = true;
            }
        }
        if (z) {
            if (this.programmaticChangeEvents && fireChangeEvent()) {
                revert();
            } else {
                this.lastSelected = null;
                changed();
            }
        }
        cleanup();
    }

    public void revert() {
        this.selected.clear(this.old.size);
        this.selected.addAll((OrderedSet) this.old);
    }

    public void set(T t) {
        if (t == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        OrderedSet<T> orderedSet = this.selected;
        if (orderedSet.size == 1 && orderedSet.first() == t) {
            return;
        }
        snapshot();
        this.selected.clear(8);
        this.selected.add(t);
        if (this.programmaticChangeEvents && fireChangeEvent()) {
            revert();
        } else {
            this.lastSelected = t;
            changed();
        }
        cleanup();
    }

    public void setActor(@Null Actor actor) {
        this.actor = actor;
    }

    public void setAll(Array<T> array) {
        snapshot();
        this.lastSelected = null;
        this.selected.clear(array.size);
        int i = array.size;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            T t = array.get(i2);
            if (t == null) {
                throw new IllegalArgumentException("item cannot be null.");
            }
            if (this.selected.add(t)) {
                z = true;
            }
        }
        if (z) {
            if (this.programmaticChangeEvents && fireChangeEvent()) {
                revert();
            } else if (array.size > 0) {
                this.lastSelected = array.peek();
                changed();
            }
        }
        cleanup();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public void setDisabled(boolean z) {
        this.isDisabled = z;
    }

    public void setMultiple(boolean z) {
        this.multiple = z;
    }

    public void setProgrammaticChangeEvents(boolean z) {
        this.programmaticChangeEvents = z;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setToggle(boolean z) {
        this.toggle = z;
    }

    public int size() {
        return this.selected.size;
    }

    public void snapshot() {
        this.old.clear(this.selected.size);
        this.old.addAll((OrderedSet) this.selected);
    }

    public Array<T> toArray() {
        return this.selected.iterator().toArray();
    }

    public String toString() {
        return this.selected.toString();
    }

    public Array<T> toArray(Array<T> array) {
        return this.selected.iterator().toArray(array);
    }
}
