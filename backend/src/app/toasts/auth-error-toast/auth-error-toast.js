function showAuthErrorToast() {
    document.getElementById('auth-error-toast').classList.remove('hidden');
}

function hideAuthErrorToast() {
    document.getElementById('auth-error-toast').classList.add('hidden');
}

function authRetry() {
    alert('Retry login');
    hideAuthErrorToast();
}

function authHelp() {
    alert('Opening help center');
    hideAuthErrorToast();
}