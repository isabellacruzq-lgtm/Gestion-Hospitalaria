function showActionErrorToast() {
    const toast = document.getElementById('action-error-toast');
    toast.classList.remove('hidden');
}

function hideActionErrorToast() {
    const toast = document.getElementById('action-error-toast');
    toast.classList.add('hidden');
}

function goHomeActionError() {
    alert('Going home');
    hideActionErrorToast();
}

function retryActionError() {
    alert('Retrying action');
    hideActionErrorToast();
}