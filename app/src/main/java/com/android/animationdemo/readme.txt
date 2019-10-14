<?xml version="1.0" encoding="utf-8"?>
<alpha xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"
    android:fromAlpha="1"//动画起始透明度
    android:toAlpha="0"//结束透明度
    android:duration="4000" />


<?xml version="1.0" encoding="utf-8"?>
   <scale xmlns:android="http://schemas.android.com/apk/res/android"
        android:interpolator="@android:anim/accelerate_decelerate_interpolator"
        android:duration="4000"
        android:fromXScale="0"//动画开始时的x坐标的伸缩尺寸
        android:fromYScale="0"
        android:toXScale="1.5"//动画结束时x坐标上的伸缩尺寸
        android:toYScale="1.5"
        android:pivotX="50%"//表示缩放起点x坐标，可以是整数值，百分数或者小数三种样式
        android:pivotY="0%"
        >
   </scale>

<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"
    android:duration="4000"
    android:fromXDelta="0%"//动画起始时 X坐标上的位置
    android:fromYDelta="100%"
    android:toXDelta="0%"//动画结束时 X坐标上的位置
    android:toYDelta="0%"
    >
</translate>

<?xml version="1.0" encoding="utf-8"?>
<rotate xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"
    android:duration="4000"
    android:fromDegrees="0"//动画起始时物件的角度
    android:toDegrees="90"//动画结束时物件旋转的角度 可以大于360度
    android:pivotX="50%"//动画相对于物件的X坐标的开始位置
    android:pivotY="50%"
    >
</rotate>


<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/decelerate_interpolator"
    android:shareInterpolator="true" >
    <scale
        android:duration="4000"
        android:fromXScale="0.2"
        android:fromYScale="0.2"
        android:pivotX="50%"
        android:pivotY="50%"
        android:toXScale="1.5"
        android:toYScale="1.5" />
    <rotate
        android:duration="4000"
        android:fromDegrees="0"
        android:pivotY="50%"
        android:pivotX="50%"
        android:toDegrees="360" />
    <translate
        android:duration="4000"
        android:fromXDelta="0"
        android:fromYDelta="0"
        android:toXDelta="320"
        android:toYDelta="0" />
    <alpha
        android:duration="4000"
        android:fromAlpha="1.0"
        android:toAlpha="0.1" />
</set>