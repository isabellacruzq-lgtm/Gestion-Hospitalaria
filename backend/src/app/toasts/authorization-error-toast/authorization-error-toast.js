function showAuthorizationErrorToast() {
    document.getElementById('authorization-error-toast').classList.remove('hidden');
}

function hideAuthorizationErrorToast() {
    document.getElementById('authorization-error-toast').classList.add('hidden');
}

function goHomeAuth() {
    alert('Going home');
    hideAuthorizationErrorToast();
}

function requestAccessAuth() {
    alert('Requesting access');
    hideAuthorizationErrorToast();
}