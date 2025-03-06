import os
import tkinter as tk
from tkinter import filedialog, messagebox

def download_android_source():
    os.system("mkdir android-os && cd android-os && repo init -u https://android.googlesource.com/platform/manifest && repo sync -j4")
    messagebox.showinfo("Téléchargement", "Code source Android téléchargé avec succès !")

def compile_android():
    os.system("cd android-os && source build/envsetup.sh && lunch aosp_arm-eng && make -j4")
    messagebox.showinfo("Compilation", "Compilation terminée avec succès !")

def flash_android():
    os.system("fastboot flashall")
    messagebox.showinfo("Flash", "OS installé sur le téléphone !")

# Interface graphique
root = tk.Tk()
root.title("Créateur d'OS Android")

tk.Button(root, text="📥 Télécharger Android", command=download_android_source).pack(pady=10)
tk.Button(root, text="⚙️ Compiler Android", command=compile_android).pack(pady=10)
tk.Button(root, text="📱 Flasher l’OS sur un téléphone", command=flash_android).pack(pady=10)

root.mainloop()
