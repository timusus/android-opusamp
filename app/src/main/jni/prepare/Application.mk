#APP_ABI is missing mips
APP_ABI := x86 armeabi armeabi-v7a

APP_MODULES := soxr ffmpeg taglib
APP_PLATFORM := android-8

APP_STL := stlport_static
APP_CPPFLAGS += -frtti 