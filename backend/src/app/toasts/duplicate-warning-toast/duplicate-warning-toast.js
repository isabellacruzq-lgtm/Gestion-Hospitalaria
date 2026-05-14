function showDuplicateWarningToast() {
    const toast = document.getElementById('duplicate-warning-toast');
    toast.classList.remove('hidden');
}

function hideDuplicateWarningToast() {
    const toast = document.getElementById('duplicate-warning-toast');
    toast.classList.add('hidden');
}

function goBackDuplicate() {
    alert('Going back');
    hideDuplicateWarningToast();
}

function viewExistingRecord() {
    alert('Viewing existing record');
    hideDuplicateWarningToast();
}