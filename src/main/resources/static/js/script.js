let currentTheme = getTheme();
changeTheme();

// Apply the theme
function changeTheme() {
    const root = document.getElementById("html-root");
    const themeBtn = document.getElementById("theme_change_button");

    if (currentTheme === "dark") {
        root.classList.add("dark");
        themeBtn.querySelector("span").innerText = "Dark";
    } else {
        root.classList.remove("dark");
        themeBtn.querySelector("span").innerText = "Light";
    }
}

// Toggle and set theme in localStorage
function toggleTheme() {
    currentTheme = currentTheme === "dark" ? "light" : "dark";
    setTheme(currentTheme);
    changeTheme();
}

function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

function getTheme() {
    return localStorage.getItem("theme") || "light";
}
